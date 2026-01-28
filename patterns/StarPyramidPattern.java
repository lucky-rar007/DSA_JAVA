import java.util.Scanner;

public class StarPyramidPattern {

    static void printStarPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n - (i - 1) && j <= n + (i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the star pyramid: ");
        int n = sc.nextInt();
        sc.close();
        printStarPyramid(n);
    }
}
