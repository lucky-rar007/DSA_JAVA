package basic_maths;
import java.util.Scanner;

public class CountDigitsInANumber {
    public static void printcount(int n) {
        if (n == 0) {
            System.out.println("1");
        } else {
            n = Math.abs(n);
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            System.out.println(count);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        printcount(n);
    }

}
