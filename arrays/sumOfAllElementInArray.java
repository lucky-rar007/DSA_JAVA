
import java.util.Scanner;

public class sumOfAllElementInArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = new int[5];
        Scanner arrScanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value of array for index " + i + ":");
            a[i] = arrScanner.nextInt();

            sum = sum + a[i];
        }
        System.out.println(sum);
        arrScanner.close();
    }

}
