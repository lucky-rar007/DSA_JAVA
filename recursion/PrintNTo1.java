package recursion;
import java.util.Scanner;

public class PrintNTo1 {
    public static void print(int n) {
        if (n == 0) {
            return;
        } else if (n > 0) {
            System.out.print(n + " ");
            n--;
            print(n);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
