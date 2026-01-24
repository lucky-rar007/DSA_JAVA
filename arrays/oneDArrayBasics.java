import java.util.Scanner;

public class oneDArrayBasics {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner arrScanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value of array for index " + i + ":");

            a[i] = arrScanner.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        arrScanner.close();
    }

}
