import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        int m,c,i=0,K,r=0,l,e=0;
        int[] a=new int[n];
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        K=sc.nextInt();
        while(n!=0){
            m=n;c=0;e=0;
            for(i=c;i<m;++i){
               if(a[i]>K)
                    e++;
                if(i+1==m && e==n)
                    r++; 
              if(m!=a.length && i+1==m){
                  m++;
                  i=c++; 
                  e=0;
              }
            }
            n--;
        }
        System.out.println(r);
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
