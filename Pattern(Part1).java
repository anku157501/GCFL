import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
        a[i][j]=1;}}
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==m-1||j==n-1)
                 System.out.print(a[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
