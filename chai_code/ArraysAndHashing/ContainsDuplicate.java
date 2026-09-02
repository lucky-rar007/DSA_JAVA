package chai_code.ArraysAndHashing;


/*
Contains Duplicate - LeetCode #217

Problem:
Given an integer array, return true if any value appears
at least twice, and false if every element is distinct.

Example:
Input:
4
1 2 3 1

Output:
true

Approach:
1. Create a HashSet to store numbers we have already seen.
2. Go through each number in the array.
3. Check if the current number already exists in the HashSet.
4. If it exists, we found a duplicate, so return true.
5. If it does not exist, add it to the HashSet.
6. If we reach the end without finding a duplicate, return false.

Why HashSet?
We only need to know:
"Have I seen this number before?"

We do not need to store any additional information
such as its index or frequency.

Therefore, HashSet is enough.

Time Complexity: O(n) average
Space Complexity: O(n)
*/

import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int x = 0; x < nums.length; x++) {

            if (seen.contains(nums[x])) {
                return true;
            }

            seen.add(nums[x]);
        }

        return false;
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

        boolean result = containsDuplicate(nums);

        System.out.println("Contains duplicate: " + result);

        sc.close();
    }
}
