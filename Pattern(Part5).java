import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=0,c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=b+a;
            }
            System.out.println(); 
        }  
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

//1 
//1 2 
//3 5 8 
//13 21 34 55 
//89 144 233 377 610 
//987 1597 2584 4181 6765 10946 
//17711 28657 46368 75025 121393 196418 317811 
//514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 
