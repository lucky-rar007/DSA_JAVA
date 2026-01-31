import java.util.Scanner;

public class diamondStarPattern {

    public static void printPattern(int n) {

        // Upper half
        for (int i = 0; i < n; i++) {

            // leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i > 0; i--) {

            // leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printPattern(n);
    }
}
