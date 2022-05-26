import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        RedeNeural nn = new RedeNeural(2, 3, 1);
        nn.train(input(0), output(0)); 

        do{

            for (int i = 0; i < 10000; i++) {
                int index = (int)Math.floor(Math.random()*4);
               nn.train(input(0), output(0)); 
            }

            System.out.println(nn.predict(input(0)).get(0));
            System.out.println(nn.predict(input(1)).get(0));
            System.out.println("Pausa");
            iScanner.next();


        }while (nn.predict(input(0)).get(0) > 0.04 || nn.predict(input(1)).get(0) < 0.98);
        
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
