import java.text.DecimalFormat;

public class Main {
    
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0E0");
        
        double timer = System.nanoTime();

        while (true) {
            
            System.out.println(df.format((System.nanoTime()-timer)/1000000000));
            timer = System.nanoTime();
        }
    }
}
