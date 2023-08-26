import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {
    public static void main(String[] args) throws IOException {
        Path filesToPath = Paths.get("CodeToFile.txt");
        // Files.lines(Paths.get("Hello.txt")).forEach(System.out::println); // for reading 
        
        List<String >list = List.of("Ananay","Papa","Aansh");
        Files.write(filesToPath, list); // To write telling path and content
    }
}
