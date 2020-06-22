import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int c,n=n1/2,i=0,d;
           while(n>=0&&i<n1){
               d=n;c=1;
            for(int j=n;j>0;j--)
                System.out.print(" ");
            for(int k=0;k<((n1/2)-d)+1;k++){
                    if(k+1==((n1/2)-d)+1)
                        System.out.print(c);
                    else
                        System.out.print(c++ +"*");
                }
               if(i>=n1/2)
                   n++;
                else
                    n--;
            i++;
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
