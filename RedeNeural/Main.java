import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        try (Scanner iScanner = new Scanner(System.in)) {
            RedeNeural nn = new RedeNeural(2, 3, 1);

            do{

                for (int i = 0; i < 10000; i++) {
                    int index = (int)Math.floor(Math.random()*4);
                   nn.train(input(index), output(index)); 
                }

            }while (nn.predict(input(0)).get(0) > 0.04 || nn.predict(input(1)).get(0) < 0.98);

            List<Double> tentativa = new ArrayList<>();

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

    static List<Double> input(int index){
        List<Double> result = new ArrayList<>();

        switch (index) {
            case 0:
                result.add(1.);
                result.add(1.);
                break;
            
            case 1:
                result.add(1.);
                result.add(0.);
                break;

            case 2:
                result.add(0.);
                result.add(1.);
                break;
            case 3:
                result.add(0.);
                result.add(0.);
                break;
        }

        return result;
    }

    static List<Double> output(int index){
        List<Double> result = new ArrayList<>();

        switch (index) {
            case 0:
                result.add(0.);
                break;
            case 1:
                result.add(1.);
                break;
            case 2:
                result.add(1.);
                break;
            case 3:
                result.add(0.);
                break;
        }

        return result;
    }
}
