package basic_maths;
import java.util.Scanner;

public class CheckArmstrong {
    public static boolean check(int n){
        int temp = n ;
        int count =0;
        while(temp>0){
            temp=temp/10;
            count++;
        }

int totalSum = 0;
int x = n; 
while(x > 0){
    int digit = x % 10;
    x = x / 10;

    int digitPower = 1;
    for(int i = 0; i < count; i++){
        digitPower *= digit;
    }

    totalSum += digitPower;
}
        if(totalSum==n){  System.out.println("True");
            return true;
          
        }
        else{   System.out.println("false");
            return false;
         

        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        check(n);
    }
}