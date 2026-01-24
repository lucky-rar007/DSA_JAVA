import java.util.Scanner;

public class charOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            System.out.print(ch + " ");
        }
    }

}
