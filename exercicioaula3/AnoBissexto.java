import java.util.Scanner;
public class AnoBissexto {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("\nVamos Verificar se um ano é Bissexto");

        boolean ciclo;
        do{
            System.out.println("---------------------------------------------- \n");
        
            System.out.print("Digite um ano: ");
            int ano = Input.nextInt();

            System.out.println("---------------------------------------------- \n");
            
            if((ano%400==0) || (ano%4==0 && ano%100!=0)){
                System.out.println(ano+" é Bissexto");
            }else{
                System.out.println(ano+" não é Bissexto");
            }

            System.out.print("Deseja tentar novamente [s]sim/[n]não:");
            ciclo = Input.next().charAt(0) == 's';

        }while(ciclo);
        
    }
}
