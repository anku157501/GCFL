#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
int n,k;
    char c,a;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        c='A';a='A';k=((n*2)-2)/2;
        if(i!=0)
            a=a+n-(i+1); 
        else
           a=a+n-2; 
        for(int j=0;j<(n*2)-1;j++){
            if(j<=k-i){
                printf("%c",c);
                c++;
            }
            else if(i>0&&j>=k+i){
                printf("%c",a);
                a--;
            }
           else if(i==0&&j==++k){
                printf("%c",a);
                a--;
           }
            else
                printf(" ");
        }
        printf("\n");
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
