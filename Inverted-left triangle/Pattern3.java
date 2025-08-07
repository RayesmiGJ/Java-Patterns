import java.util.*;

public class Pattern3{
    public static void main(String R[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                 System.out.print(i);
                           }
           
            System.out.println();
        }
         }
}

/*
 OUTPUT:
 Enter no of rows:
5
55555
 4444
  333
   22
    1
 */