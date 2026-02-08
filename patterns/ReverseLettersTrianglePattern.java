import java.util.Scanner;

/*
Input=3
output=
ABC
AB
A
*/

public class ReverseLettersTrianglePattern {

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char ascii = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(ascii);
                ascii++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

}
