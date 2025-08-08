import java.util.*;

public class pascal {
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
          int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j); // Binomial coefficient
            } 
        System.err.println();
     }
    }
}

/*
 OUTPUT:
 Enter no of rows:
5
    1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */