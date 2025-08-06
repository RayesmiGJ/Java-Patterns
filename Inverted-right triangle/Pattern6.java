import java.util.*;

public class Pattern6{
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(j);
        }
        System.out.println();
     }
    }
}

/*
 OUTPUT:
 Enter no of rows:
5
54321
5432
543
54
5
 */