#include<stdio.h>
int main(){
    int var=75;
    int var2=56;
    int num;
    num=sizeof(var)?(var2>23?((var==75)? 'a' : 0) :0):0;
    printf("%d",num);

}