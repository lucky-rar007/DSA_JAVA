/*
Input: 3
Output:
******
**  **
*    *
*    *
**  **
******
*/

import java.util.Scanner;

public class SymmetricVoidPattern {

    public static void printPattern(int n) {
        // Upper half
        int sp = 0;
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Spaces 
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            sp += 2; 
            System.out.println();
        }

        // Lower half
        sp = 2 * (n - 1); // Initialize spaces 
        for (int i = 1; i <= n; i++) {
          
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Spaces 
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
           
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            sp -= 2; 
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
