#include <stdio.h>
#include <math.h>

int main(void){

	printf("\tValos calcular a sequencia de fibonacci\n");

	printf("\tDigite a posicao: ");
	int n;
	scanf("%d", &n);

	int fibonacci = (int)((pow((1+sqrt(5))/2, n) - pow((1-sqrt(5))/2, n))/sqrt(5));

	printf("\n\tO valor de fibonacci na posicao %d é : %d\n", n, fibonacci);
}
