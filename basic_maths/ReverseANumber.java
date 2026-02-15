package basic_maths;
import java.util.Scanner;

public class ReverseANumber {
    public int reverse(int x) {
        int temp = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            if (temp > Integer.MAX_VALUE / 10 || (temp == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (temp < Integer.MIN_VALUE / 10 || (temp == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            temp = temp * 10 + digit;
        }

        return temp;
    }

    public static void main(String[] args) {
        ReverseANumber obj = new ReverseANumber();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(obj.reverse(x));
        sc.close();
    }
}
