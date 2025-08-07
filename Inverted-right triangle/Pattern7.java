import java.util.*;

public class Pattern7{
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            if(j==1||i==n||i==j){
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