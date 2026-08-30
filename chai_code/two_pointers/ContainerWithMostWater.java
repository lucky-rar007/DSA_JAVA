package chai_code.two_pointers;


/*
Container With Most Water - LeetCode #11

Problem:
Given an integer array where each element represents the height
of a vertical line, choose two lines that together with the x-axis
form a container that holds the most water.

Example:
Input:
9
1 8 6 2 5 4 8 3 7

Output:
49

Approach:
1. Start with two pointers at both ends of the array.
2. Calculate the area between the two lines.
3. Keep track of the maximum area found.
4. Move the pointer pointing to the shorter line.
5. Continue until left and right pointers meet.

Why move the shorter line?
The shorter line limits the height of the container.
Moving the taller line would decrease the width without giving
us a chance to increase the limiting height.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {

            int area = (right - left)
                    * Math.min(height[left], height[right]);

            max = Math.max(max, area);

            // Move the pointer pointing to the shorter line.
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
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

        int result = maxArea(height);

        System.out.println("Maximum water area: " + result);

        sc.close();
    }
}
