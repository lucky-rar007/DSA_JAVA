import java.util.Scanner;

public class twoDArraySum {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int sum = 0;
        Scanner arrScanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = arrScanner.nextInt();

            }
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
            System.out.println("the sum of row " + i + " is " + sum);
            sum = 0;
        }
        arrScanner.close();

    }
}
