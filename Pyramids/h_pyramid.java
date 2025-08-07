import java.util.*;

class h_pyramid {
    public static void main(String R[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of rows:"); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
          for(int j=1;j<=2*i-1;j++){
                if(i==n||j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           
        System.err.println();
     }
    }
}

/*
 Enter no of rows:
5
    *
   * *
  *   *
 *     *
*********
 */
