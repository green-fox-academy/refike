import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        List<String> content = new ArrayList();
        content.add("Megyaszai Dániel");
        content.add("Szép estét kend uram!");

        try {
            Path filePath = Paths.get("my-file.txt");
            if (Files.isWritable(filePath))
            Files.write(filePath,content);
        } catch (Exception ex){
            System.out.println("Unable to write file: my-file.txt");

        }
    }
}
