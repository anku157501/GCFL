import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=n,c=1,d=2,e;
        if(m%2==0)
            e=m-1;
        else
            e=m-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j+n==n&&i!=0){
                    if(d<m)
                    {c=m*d+1;
                     d=d+2;}
                    else
                    {c=m*e+1;
                     e=e-2;}
                }
                if(j!=n-1)
                   System.out.print(c+"*");
                else
                    System.out.print(c);
                c++;}
        System.out.print("\n");}
                
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
