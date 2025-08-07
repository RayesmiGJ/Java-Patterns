import java.util.*;

public class Pattern4 {
    public static void main(String R[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                 if(i==j||i==n||j==1){
                    System.out.print("*");
                 }
                 else{
                    System.out.print(" ");
                 }
                           }
           
            System.out.println();
        }
         }
}

/*
 OUTPUT:
 Enter no of rows:
5
*****
 *  *
  * *
   **
    *
 */