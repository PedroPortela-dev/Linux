import java.util.Scanner;

public class provabilidade {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a provabilidade: ");
        double provabilidade = input.nextDouble();

        int q;
        for(q = 1; provabilidade != Math.round(provabilidade); q*=10, provabilidade *= 10){}
        int p = q-(int)provabilidade;

        for (double i = Math.min(p, q); i > 1; i--) {
            
            if(p%i==0 && q%i==0){
                p /=i;
                q /=i;
            }
        }

        System.out.println(p);
        System.out.println(q);

        System.out.print("Digite [a] quantidade de acertos, [t] quantidade de tentativas: ");
        char escolha = input.next().charAt(0);
        if(escolha == 'a'){

            System.out.print("Digite a quantidade de acertos:  ");
            int acertos = input.nextInt();
            
            double result;
            int tentativas = acertos;
            do{
                result = 0;
                for (int i = 0; i < acertos; i++) {
                    result += Math.pow(p, tentativas-i)/Math.pow(q, tentativas)*fatorial(tentativas)/fatorial(i)/fatorial(tentativas-i);
                }

                if(result < 0.5){
                    System.out.println("Quantidade de tentativas = "+ tentativas + "\nPorcentagem de acerto = "+(1-result));
                    break;
                }
                tentativas++;
            }while(true);

        }else if(escolha == 't'){

            System.out.print("Digite a quantidade de tentativas:  ");
            int tentativas = input.nextInt();   

        }else{

            System.out.println("opção invalida");
        }

    }

    public static int fatorial(int a) {

        if(a == 1 || a == 0){
            return 1;
        }

        return a*fatorial(a-1);
        
    }
    
}
