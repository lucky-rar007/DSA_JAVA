/*
input =3
output:
  A
 ABA
ABCBA
 */

import java.util.Scanner;

public class AlphaHillPattern {

    public static void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            char ascii = 'A';
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j < i) {
                    System.out.print(ascii);
                    ascii++;
                } else if (j == i) {
                    System.out.print(ascii);

                } else {
                    ascii--;
                    System.out.print(ascii);
                }

            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();

    }

}
