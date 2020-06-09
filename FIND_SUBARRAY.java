/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m,c,i=0;
	    int[] a=new int[n];
	    for(int k=0;k<n;k++){
	        a[k]=sc.nextInt();
	    }
	    while(n!=0){
	        m=n;c=0;
	        for(i=c;i<m;++i){
	           System.out.print(a[i]);
	          if(m!=a.length && i+1==m){
	              m++;
	              i=c++;
	              
	        System.out.print(",");
	          }
	        }
	        System.out.print("\n");
	        n--;
	        
	    }
		
	}
}


//OUTPUT
10                                                                                                                              
1 2 3 4 5 6 7 8 9 10                                                                                                            
12345678910                                                                                                                     
123456789,2345678910                                                                                                            
12345678,23456789,345678910                                                                                                     
1234567,2345678,3456789,45678910                                                                                                
123456,234567,345678,456789,5678910                                                                                             
12345,23456,34567,45678,56789,678910                                                                                            
1234,2345,3456,4567,5678,6789,78910                                                                                             
123,234,345,456,567,678,789,8910                                                                                                
12,23,34,45,56,67,78,89,910                                                                                                     
1,2,3,4,5,6,7,8,9,10     
