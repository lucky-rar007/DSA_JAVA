/*
Two Sum II - LeetCode #167

Problem:
Given a 1-indexed array of integers that is already sorted
in non-decreasing order, find two numbers that add up to
the target.

Approach:
1. Use two pointers:
   - left starts at the beginning.
   - right starts at the end.
2. If the sum equals the target, return the indices.
3. If the sum is smaller than the target, move left forward.
4. If the sum is larger than the target, move right backward.

Because the array is sorted, moving the pointers this way
allows us to find the answer in one pass.

Time Complexity: O(n)
Space Complexity: O(1)

Note:
The problem uses 1-based indexing, so we return
left + 1 and right + 1.
*/

package chai_code.two_pointers;

import java.util.Scanner;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};

            } else if (sum < target) {
                left++;

            } else {
                right--;
            }
        }

        // The problem guarantees exactly one solution.
        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements in sorted order:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        System.out.println(
            "Indices: [" + result[0] + ", " + result[1] + "]"
        );

        sc.close();
    }
}
