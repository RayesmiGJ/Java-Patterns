import java.util.*;

public class rev_pyramid {
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=n;i>=1;i--){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
          for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
           
        System.err.println();
     }
    }
}


/*
 OUTPUT:
 Enter no of rows:
5
*********
 *******
  *****
   ***
    *
 */