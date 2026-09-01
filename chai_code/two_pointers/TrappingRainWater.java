/*
Trapping Rain Water - LeetCode #42

Problem:
Given an array of non-negative integers representing an
elevation map where the width of each bar is 1, calculate
how much water can be trapped after raining.

Approach:
1. Use two pointers:
   - left starts at the beginning.
   - right starts at the end.
2. Maintain:
   - leftMax = maximum height seen from the left.
   - rightMax = maximum height seen from the right.
3. Compare the heights at left and right:
   - If height[left] < height[right], process the left side.
   - Otherwise, process the right side.
4. When processing the left:
   - Update leftMax if the current height is larger.
   - Otherwise, water trapped = leftMax - height[left].
5. When processing the right:
   - Update rightMax if the current height is larger.
   - Otherwise, water trapped = rightMax - height[right].
6. Move the corresponding pointer inward.

Key Insight:
Water at a position depends on the smaller of the maximum
height on its left and the maximum height on its right.

If height[left] < height[right], the right side already has
a boundary at least as tall as height[left]. Therefore, the
left position can be safely processed using leftMax.

Similarly, when height[right] <= height[left], the right
position can be safely processed using rightMax.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package chai_code.two_pointers;

import java.util.Scanner;

public class TrappingRainWater {

    public static int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;
        int total = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    total += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    total += rightMax - height[right];
                }

                right--;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter " + n + " heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = trap(height);

        System.out.println("Trapped water: " + result);

        sc.close();
    }
}
