#include <stdio.h>
#include <math.h>

int main(){

	printf("\tDescubra o maior valor entre dois numeros\n");

	int valor1;
	printf("\tDigite o primeiro valor: ");
	scanf("%d",&valor1);

	int valor2;
	printf("\tDigite o segundo valor: ");
	scanf("%d", &valor2);

	int maiorValor = (int)(abs(valor1+valor2)+abs(valor1-valor2))/2;
	int menorValor = (int)(abs(valor1+valor2)-abs(valor1-valor2))/2;

	printf("\tMaior valor = %d\n\tMenor Valor = %d\n", maiorValor, menorValor);

	return 0;
}
