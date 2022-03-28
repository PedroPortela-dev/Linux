import java.util.Scanner;

/**
 * Calculadora
 */
public class Calculadora {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("\nCalculadora");
        System.out.println("---------------------------------------------- \n");
        
        System.out.print("Digite o 1º numero: ");
        double num1 = Input.nextDouble();
        System.out.println("---------------------------------------------- \n");
        
        System.out.print("Digite o 2º numero: ");
        double num2 = Input.nextDouble();
        System.out.println("----------------------------------------------");
        
        System.out.print(" (+)soma\n (-)subtração\n (*) multiplicação\n (/)Divisão\n (%)OperadorResto\n");
        System.out.println("---------------------------------------------- ");
        System.out.println("Digite uma operação");
        char operador = Input.next().charAt(0);
        System.out.println("---------------------------------------------- \n");

        double result=0;
        switch (operador) {
            case '+':
                
                result = num1 + num2;
                break;

            case '-':
                
                result = num1 - num2;
                break;
        
            case '*':
                
                result = num1 * num2;
                break;

            case '/':

                result = num1 / num2;
                break;

            case '%':

                result = num1 % num2;
                break;
            
            default:
        }
        
        System.out.println(num1 + " " + operador + " " + num2 + " = " + result);
    }
}