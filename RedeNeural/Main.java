import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        List<List<Double>> input = new ArrayList<>();
        List<List<Double>> output = new ArrayList<>();
        List<Double> tentativa = new ArrayList<>();
        input.add(tentativa);
        input.add(tentativa);
        input.add(tentativa);
        input.add(tentativa);
        input.get(0).add(1.);
        input.get(0).add(1.);
        input.get(1).add(1.);
        input.get(1).add(0.);
        input.get(2).add(0.);
        input.get(2).add(1.);
        input.get(3).add(0.);
        input.get(3).add(0.);
        output.add(tentativa);
        output.add(tentativa);
        output.add(tentativa);
        output.add(tentativa);
        output.get(0).add(0.);
        output.get(1).add(1.);
        output.get(2).add(1.);
        output.get(3).add(0.);

        try (Scanner iScanner = new Scanner(System.in)) {
            RedeNeural nn = new RedeNeural(2, 3, 1);

            do{

                for (int i = 0; i < 10000; i++) {
                    int index = (int)Math.floor(Math.random()*4);
                    nn.train(input.get(index), output.get(index)); 
                }

            }while (nn.predict(input.get(0)).get(0) > 0.04 || nn.predict(input.get(1)).get(0) < 0.98);

            do {
                System.out.println("Tentar[1]/[0]");
                int Tentar = iScanner.nextInt();

                if (Tentar == 0) {
                    break;
                }

                tentativa.clear();
                tentativa.add(iScanner.nextDouble());
                tentativa.add(iScanner.nextDouble());
                
                System.out.println("A Saida é : "+ nn.predict(tentativa).get(0));
            } while (true);
        }
    }
}