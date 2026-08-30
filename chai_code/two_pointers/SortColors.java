/*
Sort Colors - LeetCode #75

Problem:
Given an array containing only 0s, 1s, and 2s, sort the array
in-place so that objects of the same color are adjacent and
the colors appear in the order 0, 1, 2.

Approach:
Use the Dutch National Flag algorithm with three pointers:

1. low:
   - Everything before low is already sorted as 0.

2. mid:
   - Everything between low and mid is already sorted as 1.
   - The region from mid to high is still unknown.

3. high:
   - Everything after high is already sorted as 2.

For each element at nums[mid]:

- If nums[mid] == 0:
  Swap it with nums[low].
  Move both low and mid forward.

- If nums[mid] == 1:
  It is already in the correct region.
  Move mid forward.

- If nums[mid] == 2:
  Swap it with nums[high].
  Move high backward.
  Do NOT move mid because the element swapped from high
  has not been checked yet.

The key invariant is:

    [0 ... low-1]       -> all 0s
    [low ... mid-1]     -> all 1s
    [mid ... high]      -> unknown
    [high+1 ... n-1]    -> all 2s

Time Complexity: O(n)
Space Complexity: O(1)

Note:
The array is modified in-place, so the method is void and
does not need to return the array.
*/

package chai_code.two_pointers;

import java.util.Scanner;

public class SortColors {

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                swap(nums, low, mid);
                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements (only 0, 1, and 2):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        sortColors(nums);

        System.out.print("Sorted array: [");

        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]);

            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}

