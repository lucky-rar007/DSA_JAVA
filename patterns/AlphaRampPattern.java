/*
input=3
output=
A
BB
CCC */
import java.util.Scanner;


public class AlphaRampPattern {
    public static void printPattern(int n){
            char ascii ='A';
            for(int i=1;i<=n;i++){
       
            for(int j=1;j<=i;j++){
                System.out.print(ascii);}
                ascii++;
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
