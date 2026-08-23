/*
Valid Palindrome - LeetCode #125

Problem:
A phrase is a palindrome if, after converting all uppercase
letters into lowercase letters and removing all non-alphanumeric
characters, it reads the same forward and backward.

Examples:

Input:
A man, a plan, a canal: Panama

Output:
true

Input:
race a car

Output:
false

Input:

Output:
true

Approach:
1. Use two pointers: left and right.
2. Skip non-alphanumeric characters.
3. Compare characters after converting them to lowercase.
4. Move both pointers towards the center.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package chai_code.two_pointers;

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters from the left.
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Skip non-alphanumeric characters from the right.
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // Compare characters ignoring case.
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = isPalindrome(s);

        System.out.println("Is palindrome: " + result);

        sc.close();
    }
}
