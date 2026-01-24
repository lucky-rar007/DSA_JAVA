import java.util.Scanner;

public class twoDArraybasic {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        Scanner arrScanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = arrScanner.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        arrScanner.close();

    }

}
