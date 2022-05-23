import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Arquivo3 {
    
    public static void main(String[] args) throws IOException {
        
        Path path = Path.of("Arquivo.txt");

        List<String> strings = Files.readAllLines(path);

        List<Integer> lista = new ArrayList<>();

        for (String texto : strings) {
            lista.add(Integer.parseInt(texto)); 
        }

        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}
