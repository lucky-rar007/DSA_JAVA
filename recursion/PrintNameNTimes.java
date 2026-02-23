package recursion;
import java.util.Scanner;

public class PrintNameNTimes {
        int count =0;
    public static void print(int n) {
         if(n==0){
         return;
        }
        else{
        System.out.print("Ashish ");
         n--;
         print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(n);
        
    }
}