import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt(),y=sc.nextInt();
        int d=(int)Math.ceil((y*n)/100.0);
        if(d<=x)
            System.out.println(0);
        else
            System.out.println(d-x);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
