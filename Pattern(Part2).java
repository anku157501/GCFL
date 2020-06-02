import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int x;
        for(int i=0;i<n;i++){
            x=n;
            for(int j=0;j<n;j++){
                if((i+j)==n-1)
                 System.out.print("*");
                else{
                    
                               System.out.print(x);}
                x--;
            }
            System.out.print("\n");
        }
      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
