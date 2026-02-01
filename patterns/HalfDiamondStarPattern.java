import java.util.Scanner;

public class HalfDiamondStarPattern {

    public static void PrintPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int k = n - 1;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        PrintPattern(x);
        sc.close();
    }
}
