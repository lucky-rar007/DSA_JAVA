package chai_code.SlidingWindow;

import java.util.HashMap;

public class MaxSumDistinctSubArrayLengthK {

    public static long maxSumDistinctSubarray(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        long sum = 0;
        long best = 0;

        for (int r = 0; r < nums.length; r++) {

            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            sum += nums[r];

            if (r >= k) {
                int outgoing = nums[r - k];
                int count = freq.get(outgoing);

                if (count == 1) {
                    freq.remove(outgoing);
                } else {
                    freq.put(outgoing, count - 1);
                }

                sum -= outgoing;
            }

            if (r >= k - 1 && freq.size() == k) {
                best = Math.max(best, sum);
            }
        }

        return best;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        System.out.println(maxSumDistinctSubarray(nums, k));
    }
}
