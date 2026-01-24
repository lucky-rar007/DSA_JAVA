import java.util.Scanner;

public class printToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        int i = 0;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}
