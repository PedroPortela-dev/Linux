import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        RedeNeural nn = new RedeNeural(2, 3, 1);
        List<Double> arr = new ArrayList<>();
        arr.add(1.);
        arr.add(2.);
        nn.feedForward(arr);
        
    }
}
