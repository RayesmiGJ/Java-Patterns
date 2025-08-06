import java.util.*;

public class Pattern6{
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i==j||j==1||i==n){
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
8
*
**
* *
*  *
*   *
*    *
*     *
********
 */