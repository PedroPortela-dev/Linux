import java.util.Scanner;

public class AnoBissexto {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("\nVamos Verificar se um ano é Bissexto");
        System.out.println("---------------------------------------------- \n");
        
        System.out.print("Digite um ano: ");
        int ano = Input.nextInt();

        System.out.println("---------------------------------------------- \n");
        
        if((ano%400==0) || (ano%4==0 && ano%100!=0)){
            System.out.println(ano+" é Bissexto");
        }else{
            System.out.println(ano+" não é Bissexto");
        }
        
    }
}
