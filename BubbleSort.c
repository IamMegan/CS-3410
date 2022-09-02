#include <stdio.h>

int main()
{
    int arr[10] = {4,2,7,6,3,0,5,6,9,0};
    
    for(int j = 0; j < 10; j++){
        for(int i = 1; i < 10; i++){
            if(arr[i] < arr[i-1]){
               int temp = arr[i];
               arr[i] = arr[i-1];
               arr[i-1] = temp;
            }
        }
    }
    
    for(int i = 0; i < 10; i++){
        printf("%d ",arr[i]);
    }
}
