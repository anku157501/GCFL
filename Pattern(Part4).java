import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m,k;
        for(int i=0;i<n;i++){
            m=1;k=i+1;
            for(int j=0;j<n*2;j++){
                if(j>=0 && j<=i)
                    System.out.print(m++);
                else if(n*2-j<=i+1)
                    System.out.print(k--);
                else
                    System.out.print(" ");
            }
            System.out.print("\n");

        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

1        1
12      21
123    321
1234  4321
1234554321
