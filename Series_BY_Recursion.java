import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int d=calinrec(n-3,a,b,c);
        System.out.println(d);
    }
     public static int calinrec(int n,int a,int b,int c){
            if(n==-2)
                return a;
            else if(n==-1)
                return b;
            else if(n==0)
                return c;
            else
                return calinrec(n-1,a,b,c)+calinrec(n-2,a,b,c)+calinrec(n-3,a,b,c);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
}
