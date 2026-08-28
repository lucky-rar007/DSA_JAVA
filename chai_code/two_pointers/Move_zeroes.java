package chai_code.two_pointers;

/*
Move Zeroes - LeetCode #283

Problem:
Given an integer array, move all zeroes to the end of the array
while maintaining the relative order of all non-zero elements.

The operation must be performed in-place.

Example:
Input:
5
0 1 0 3 12

Output:
1 3 12 0 0

Approach:
1. Use two pointers: slow and fast.
2. The fast pointer scans every element in the array.
3. The slow pointer represents the position where the next
   non-zero element should be placed.
4. When fast finds a non-zero element, swap it with the element
   at slow.
5. Increment slow.
6. Continue until fast reaches the end.

Why does this work?
All non-zero elements are moved toward the front while their
relative order is preserved.
The remaining positions naturally contain zeroes.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Move_zeroes {

    public static void moveZeroes(int[] nums) {

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
