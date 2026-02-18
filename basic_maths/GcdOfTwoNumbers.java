package basic_maths;
import java.util.Scanner;
//find the greatest common divisor of two numbers

public class GcdOfTwoNumbers {

    public static long gcd(long x, long y){
        if(x==0 && y==0){
            return 0;
        }
        else if(x==0&&y!=0){
            return y;
        }
        else if(y==0&&x!=0){
            return  x;
        }
        else{while(y!=0){
            long r=x%y;
            x=y;
            y=r;
        }
        
        return x;}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a, b));
        sc.close();
    }
}