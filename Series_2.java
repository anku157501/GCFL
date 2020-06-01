import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution {

    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        if(n!=1){
        for(int i=1;i<n;i++){
        a=a+(i+1)*(i+1)*(i+1)*(i+1);
            //System.out.println(a);  
        }}
            System.out.println(a);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
