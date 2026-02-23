package recursion;
import java.util.Scanner;

public class Print1ToN {
    public static void print(int n, int i) {
        if (n == 0) {
            return;
        } else if(n>0){
            System.out.print(i+" ");
            i++;
            n--;
            print(n, i);
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        print(n, i);
        sc.close();
    }
}
