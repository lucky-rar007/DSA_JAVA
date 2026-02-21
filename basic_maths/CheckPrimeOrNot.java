package basic_maths;
import java.util.Scanner;

public class CheckPrimeOrNot {
    public static boolean print(int N) {
        if (N > 1) {
            int sqrtN = (int) Math.sqrt(N);
            for (int i = 2; i <= sqrtN; i++) {
                if (N % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(print(n));

    }

}
