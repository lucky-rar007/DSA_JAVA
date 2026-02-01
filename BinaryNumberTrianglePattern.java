/*
input: 5
output:
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/





import java.util.Scanner;

public class BinaryNumberTrianglePattern {
    public static void printPattern(int n) {
        int curr;
        int rowstart = 1;  // starting value of first row

        for (int i = 1; i <= n; i++) {
            curr = rowstart;  // set current value to row start
            for (int j = 1; j <= i; j++) {
                System.out.print(curr + " ");
                curr = 1 - curr;  // flip for next column
            }
            rowstart = 1 - rowstart;  // flip row start for next row
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
