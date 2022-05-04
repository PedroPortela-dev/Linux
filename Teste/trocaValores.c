#include <stdio.h>

int main(){

	printf("\tVamos trocar os valores de posicao\n\n");

	printf("\tDigite o valor da variavel a = ");
	int a;
	scanf("%d", &a);

	printf("\tDigite o valor da variavel b = ");
	int b;
	scanf("%d", &b);

	printf("\n\tInicialmente a = %d\n\t             b = %d\n", a, b);

	int cpa = a;
	a = b;
	b = cpa;

	printf("\n\tAtualmente a = %d\n\t           b = %d\n", a, b);

	return 0;
}
