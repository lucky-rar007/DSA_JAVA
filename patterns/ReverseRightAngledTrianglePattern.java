import java.util.Scanner;

public class ReverseRightAngledTrianglePattern {

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j <=  i; j--) {
                System.out.print("* ");
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
