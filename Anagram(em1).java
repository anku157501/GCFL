import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        String s,s2;
        int j;
        while(t-->0){
            s=sc.next();
            s2=sc.next();
            if(s.length()!=s2.length())
                System.out.println("NO");
            else{
            char[] c1=s2.toCharArray();
            for(char c:s.toCharArray()){
                for(int i=0;i<c1.length;i++){
                    if(c==c1[i]){
                        { c1[i]=' ';
                         break;}
                    }
                }
            }
                for(j=0;j<c1.length;j++){
                 if(c1[j]!=' ')
                     break;
                }
            if(j==c1.length)
                    System.out.println("YES");
            else
                    System.out.println("NO");
            }
            
                
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
