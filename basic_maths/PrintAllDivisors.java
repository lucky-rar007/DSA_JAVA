package basic_maths;
import java.util.*;

public class PrintAllDivisors {
    public static void print(int N) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                divisors.add(i); 
                if (i != N / i)
                    divisors.add(N / i); 
            }
        }
        Collections.sort(divisors);
        System.out.println(divisors);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        print(N);
    }
}
