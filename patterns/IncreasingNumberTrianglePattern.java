/*input :
 n = 3


output:
1
2 3
4 5 6
 */


import java.util.Scanner;

public class IncreasingNumberTrianglePattern {

    public static void printPattern(int n) {
        int pn = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pn + " ");
                pn++;
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
