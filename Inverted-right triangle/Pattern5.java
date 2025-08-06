import java.util.*;

public class Pattern5{
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(i);
        }
        System.out.println();
     }
    }
}

/*
 Enter no of rows:
5
11111
2222
333
44
5
 */