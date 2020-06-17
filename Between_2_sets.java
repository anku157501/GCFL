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
	    int a[]={2};
	    int b[]={20,30,12};
	    int m,t=1,d,i,j,c=0;
	    Arrays.sort(a);
	    Arrays.sort(b);
	   
	    if(b[b.length-1]<a[a.length-1])
	    m=b[b.length-1];
	    else
	    m=a[a.length-1];
	    
	        while(t>0&&(d<=b[b.length-1]||d<=a[a.length-1])){
	            d=m*t;i=0;j=0;
	            for(i=0;i<a.length;i++){
	                if(d%a[i]!=0)
	                    break;
	           }
	            if(i==a.length){
	                for(j=0;j<b.length;j++){
	                    if(b[j]%d!=0)
	                        break;
	                }
	            }
	            if(j==b.length){
	                c++;	
	            }
	        t++;
	        }
	 System.out.println(c);
	}
}
