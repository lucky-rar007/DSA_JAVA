/*
input=3
output:
C
BC
ABC
 */

import java.util.Scanner;

public class AlphaTrianglePattern {


    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ascii = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print((char)(ascii + (n - i + j)));
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
