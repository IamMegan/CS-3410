#include <stdio.h>

int mult5sum(int n){
    if(n == 0)
        return 0;
    else{
        return 5*(2*n-1) + mult5sum(n-1);
    }
}

int main()
{
    
    int i;
    printf("%d", mult5sum(scanf("%d", &i)));
    return 0;
}
