/*


input=3
output:
*    *
**  **
******
**  **
*    * 


*/

import java.util.Scanner;

public class SymmetricButterflyPattern {

    public static void printPattern(int n){
        //upper half
      
        for(int i=1;i<=n;i++){ 
            int sp=2*(n-i);   
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            
            
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
        //lowerhalf
        for(int i=n+1;i<=((2*n)-1);i++){
            int sp=2*(i-n);
            //stars
            for(int j=0;j<((2*n)-i);j++){
                System.out.print("*");
            }
           //spaces
             for(int j=0;j<sp;j++){
               System.out.print(" ");
             }
           //stars
       for(int j=0;j<((2*n)-i);j++){
               System.out.print("*");
          }
          System.out.println("");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
