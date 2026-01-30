import java.util.*;

class InvertedStarPyramid {

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {

            // leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < ((2 * n) - (2 * i) - 1); j++) {
                System.out.print("*");

            }

            // trailing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

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