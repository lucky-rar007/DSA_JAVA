package chai_code.ArraysAndHashing;


/*
Two Sum - LeetCode #1

Problem:
Given an array of integers and a target, return the indices
of the two numbers that add up to the target.

Exactly one solution exists, and we may not use the same
element twice.

Example:
Input:
4
2 7 11 15
9

Output:
0 1

Approach:
1. Use a HashMap to store each number we have already seen.
2. Store the number as the key and its index as the value.
3. For every number, calculate the number we need:
       need = target - nums[i]
4. Check if 'need' already exists in the HashMap.
5. If it exists, we found the two numbers:
       seen.get(need) and i
6. If it does not exist, store the current number and its index.
7. Return the two indices when the pair is found.

Why HashMap?
We need to quickly answer:
"Have I already seen the number I need?"

A HashSet could tell us whether the number exists,
but we also need its index.

Therefore we use:
    number → index

Example:
    2 → 0
    7 → 1

Time Complexity: O(n) average
Space Complexity: O(n)
*/

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // number → index
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            // Check if the number we need was seen before.
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }

            // Store current number → current index.
            seen.put(nums[i], i);
        }

        // Problem guarantees exactly one solution.
        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println(
                "Indices: " + result[0] + " " + result[1]
        );

        sc.close();
    }
}
