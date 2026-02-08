/*
Input=3
output=
A
AB
ABC
*/



import java.util.Scanner;


public class IncreasingLettersTrianglePattern {
    
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            char ascii ='A';
            for(int j=1;j<=i;j++){
                System.out.print(ascii);
                ascii++;}
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
