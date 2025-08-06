import java.util.*;

public class Pattern4 {
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
             if((i+j)%2==0){
                 System.out.print(1);
             }
             else{
                 System.out.print(0);
             }
        }
        System.out.println();
     }
    }
}

/*
 OUTPUT
Enter no of rows:
5
1
01
101
0101
10101
 */