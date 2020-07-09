import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(),n=sc.nextInt(),a,y;
        while(n>0){
            a=sc.nextInt();
            y=sc.nextInt();
            if(s<a)
                break;
            else
             s=s+y;
            n--;
        }
        if(n==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
