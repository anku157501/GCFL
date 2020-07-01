import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    char[] a=s1.toCharArray();
    int m=0,n=s1.length();
    String s="";
    for(int i=0;i<n;i++){
        if(a[i]=='('&&a[i-1]=='-') {
            m = i + 1;
            while (a[m] != '(' &&a[m]!=')') {
                if (a[m] == '-')        
                    s = s + '+';
                else if (a[m] == '+')
                    s = s + '-';
                else
                    s = s + a[m];
                m++;
            }
            i=m-1;
        }
        else if(a[i]!=')'&&a[i]!='(')
            s=s+a[i];
        else if(a[i]=='('&&a[i-1]=='-')
            i--;
        }
        System.out.println(s);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}                                                                                                                                                                                       
