/*
input=3
output:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3*/

import java.util.Scanner;

public class the_beautiful_number_pattern {

    static void printPattern(int n) {
        for (int i = 0; i <= 2 * n - 2; i++) {
            for (int j = 0; j <= 2 * n - 2; j++) {
                int mindist = Math.min(Math.min(i, j), Math.min((2 * n - 2) - i, (2 * n - 2) - j));
                int value = n - mindist;
                System.out.print(value + " ");
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
