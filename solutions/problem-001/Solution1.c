// Solution of Problem 1 of projecteuler in C

#include <stdio.h>

int main(){
	int N=0,aux=0;
	
	while(N<1000){
		if(N%3==0 || N%5==0){
			aux+=N;
		}
		
		N++;
	}
	
	printf("%d",aux);
}
