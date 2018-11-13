import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copyFile("my-file.txt"));

    }
    public static boolean copyFile (String a) {
        boolean state;
        try {
            Path filePath = Paths.get(a);
            Path file2Path = Paths.get("mysecond.txt");
            List<String> myList = Files.readAllLines(filePath);
            Files.write(file2Path,myList);
            state = true;
        } catch (Exception ex){
            ex.printStackTrace();
            state = false;
        }

        return state;

    }
}
