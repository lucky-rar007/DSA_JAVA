/* Right Angled Same Number Pyramid 
input: 3
output:
1 
2 2 
3 3 3 
*/



import java.util.Scanner;

public class RightAngledSameNumberPyramid {

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
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
