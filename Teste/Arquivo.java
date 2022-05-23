import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Arquivo
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {
        
        Path path = Path.of("Arquivo.txt");

        if(Files.notExists(path)) Files.createFile(path);

        String texto = "";

        for (int i = 0; i < 100; i++) {
            texto += i + "\n";
        }

        Files.writeString(path,texto);
    }
}