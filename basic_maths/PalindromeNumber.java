package basic_maths;
import java.util.Scanner;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        if (x >= 0 && x <= 9) {
            return true;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = reversedHalf * 10 + lastDigit;
            x /= 10;
        }

        return (x == reversedHalf) || (x == reversedHalf / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PalindromeNumber pn = new PalindromeNumber();
        boolean result = pn.isPalindrome(n);
        System.out.println(result);

        sc.close();
    }
}
