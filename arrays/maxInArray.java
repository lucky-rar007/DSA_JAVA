import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        int max = 0;
        int[] a = new int[5];
        Scanner arrScanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value of array for index " + i + ":");
            a[i] = arrScanner.nextInt();
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println(max);
        arrScanner.close();
    }

}
