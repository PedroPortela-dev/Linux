import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Arquivo2 {
    
    public static void main(String[] args) throws IOException {
        
        Path path = Path.of("Arquivo.txt");

        Files.deleteIfExists(path);
    }
}
