package chai_code.SlidingWindow;

public class MaximumAvgSubArrayI {

    public static double maxavgsubarray(int[] nums, int k) {

        int max_sum = 0;


        for (int i = 0; i < k; i++) {
            max_sum += nums[i];
        }

        int curr_sum = max_sum;

        for (int i = k; i < nums.length; i++) {
            curr_sum += nums[i] - nums[i - k];

            max_sum = Math.max(max_sum, curr_sum);
        }

        return (double) max_sum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(maxavgsubarray(nums, k));
    }
}
