package chai_code.ArraysAndHashing;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        Map<Integer, Integer> count = counter(nums);

        int[] result = bucketSorter(count, k, nums.length);

        System.out.println(Arrays.toString(result));
    }
    public static Map<Integer, Integer> counter(int[] nums){
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num,count.getOrDefault(num,0)+1);
        }
        return count;
    }

    public static int[] bucketSorter(Map<Integer, Integer> count, int k, int n)
    {

    List<List<Integer>> buckets = new ArrayList<>();

    for (int i = 0; i <= n; i++) {
    buckets.add(new ArrayList<>());
    }

    for (int num : count.keySet()) {
    int freq = count.get(num);
    buckets.get(freq).add(num);
    }

    int[] result = new int[k];

    int index = 0;
    for (int i = buckets.size() - 1; i >= 0 && index < k; i--) {
    List<Integer> bucket = buckets.get(i);
    for (int num : bucket) {
    result[index++] = num;
    if (index == k) {
            break;
        }
    }
    }

    return result;
    }}

