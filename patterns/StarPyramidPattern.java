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



/*ANOTHER METHOD EASIER ONE BUT NOT VERY SCALABLE

class Solution {
    // Function to print Pattern 7
    public void pattern7(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern7(N);
    }
}
*/
