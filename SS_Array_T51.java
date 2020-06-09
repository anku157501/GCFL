import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c,s;
        while(t!=0){
            c=0;s=1;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                s=s*sc.nextInt();
            }
            
            for(int i=1;i<=s;i++){
                if(s%i==0)
                    c++;
            }
            System.out.println(c);
            t--;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
