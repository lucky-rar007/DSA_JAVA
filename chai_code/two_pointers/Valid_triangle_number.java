package chai_code.two_pointers;

/*
Valid Triangle Number - LeetCode #611

Problem:
Given an integer array representing side lengths, count how many
triplets can form a valid triangle.

For three sides a, b, c to form a triangle:
a + b > c

After sorting, we can assume arr[k] is the largest side.
Therefore, we only need to check:

arr[left] + arr[right] > arr[k]

Example:
Input:
4
2 2 3 4

Output:
3

Valid triangles:
[2, 2, 3]
[2, 3, 4]
[2, 3, 4]

Approach:
1. Sort the array.
2. Fix k as the largest side, starting from the end.
3. Set left = 0 and right = k - 1.
4. If arr[left] + arr[right] > arr[k]:
   - All elements between left and right can form a triangle
     with arr[right] and arr[k].
   - Add (right - left) to count.
   - Move right backward.
5. Otherwise, the smallest side is too small, so move left forward.
6. Repeat for every possible largest side.

Why count += right - left?
If arr[left] + arr[right] > arr[k], then because the array is sorted,
every element between left and right is >= arr[left].

Therefore:
arr[left] + arr[right] > arr[k]

means:
arr[left + 1] + arr[right] > arr[k]
arr[left + 2] + arr[right] > arr[k]
...

So there are (right - left) valid pairs.

Time Complexity: O(n²)
Space Complexity: O(1) extra space
*/

import java.util.*;

public class Valid_triangle_number {

    public static int triangleNumber(int[] nums) {

        Arrays.sort(nums);

        int count = 0;

        for (int k = nums.length - 1; k >= 2; k--) {

            int left = 0;
            int right = k - 1;

            while (left < right) {

                if (nums[left] + nums[right] > nums[k]) {

                    count += right - left;
                    right--;

                } else {

                    left++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " side lengths:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = triangleNumber(nums);

        System.out.println("Number of valid triangles: " + result);

        sc.close();
    }
}
