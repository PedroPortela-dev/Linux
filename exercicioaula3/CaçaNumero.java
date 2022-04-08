import java.util.Scanner;

public class CaçaNumero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Tente descobrir qual é o numero da sorte.");

        boolean ciclo;
        do{

            int numSorte = (int)Math.ceil(Math.random()*99);

            int i;
            for(i=0; i<6; i++){

                System.out.println("---------------------------------------------- \n");

                System.out.print("Tente um numero:  ");
                int num = input.nextInt();
                System.out.println("---------------------------------------------- \n");

                if(num == numSorte){
                    System.out.println("Parabéns vc ganhou!!!");
                    break;
                }else if(num < numSorte){
                    System.out.println("Valor mais baixo que numero da sorte");
                }else{
                    System.out.println("Valor mais alto que numero da sorte");
                }
                
            }

            System.out.print("Deseja tentar novamente [s]sim/[n]não:");
            ciclo = input.next().charAt(0) == 's';

        }while(ciclo);
    }
    
}
