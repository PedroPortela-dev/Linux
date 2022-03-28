import java.util.Scanner;

public class Aumento {
    
    public static void main(String[] args) {
        
        double aumento, novoSalário;

        Scanner Input = new Scanner(System.in);
        
        System.out.println("\n---------------------------------------------- \n");
        
        System.out.print("Qual o salário do funcionário? R$ ");
        double salário = Input.nextDouble();

        System.out.println("---------------------------------------------- \n");

        if(salário <= 1250){
            aumento = 1.15;
        }else{
            aumento = 1.1;
        }

        novoSalário = salário*aumento;

        System.out.println("O novo salário do funcionário agora é R$ "+novoSalário);
        System.out.println("---------------------------------------------- \n");
    }
}
