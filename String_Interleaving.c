#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char a[26],b[26],c[26];
    int m,n,x,cc=0;
    gets(a);
    gets(b);
    gets(c);
    m=strlen(a);
    n=strlen(b);
    x=strlen(c);
    for(int i=0;i<m;i++){
        for(int j=0;j<x;j++){
            if(a[i]==c[j])
            {c[j]='*';
             cc++;
                break;}
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<x;j++){
            if(b[i]==c[j])
            {c[j]='*';
             cc++;
                break;}
        }
    }
    if(cc==m+n){
        
        printf("Yes");
    }
    else
        printf("No");
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
