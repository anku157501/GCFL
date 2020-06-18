import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int i,j,k=0,n;
        String s9,s0,s2;
        
        while(t-->0){
            s2="";k=0;n=0;
            s9=sc.next();
            char a[]=s9.toCharArray();
            for(char b:a){
                if(b=='.')
                    n++;
            }
            String s[]=new String[n+1];
           for(int d=0;d<a.length;d++){
            if(a[d]=='.')
            {s[k++]=s2;
            s2="";}
            else
            s2+=a[d];
        }
        s[k]=s2;
        i=0;j=s.length-1;
        while(i<j){
            s0=s[i];
            s[i++]=s[j];
            s[j--]=s0;
        }s2="";
         for(int d=0;d<s.length-1;d++){
        
                s2=s2+s[d]+".";
                
            }
            s2=s2+s[s.length-1];
            System.out.println(s2);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
