package chai_code.two_pointers;
/*
3Sum - LeetCode #15

Problem:
Given an integer array, find all unique triplets
whose sum is equal to 0.

Example:
Input:
6
-1 0 1 2 -1 -4

Output:
[[-1, -1, 2], [-1, 0, 1]]

Approach:
1. Sort the array.
2. Fix one element using i.
3. Use two pointers (left and right) to find the other two elements.
4. Skip duplicate values to avoid duplicate triplets.

Time Complexity: O(n^2)
Space Complexity: O(n) for the result.
*/

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= nums.length - 3; i++) {

            // Skip duplicate values for the first element.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(
                        Arrays.asList(nums[i], nums[left], nums[right])
                    );

                    left++;
                    right--;

                    // Skip duplicate values for left pointer.
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate values for right pointer.
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = threeSum(nums);

        System.out.println("Triplets that sum to 0:");
        System.out.println(result);

        sc.close();
    }
}
