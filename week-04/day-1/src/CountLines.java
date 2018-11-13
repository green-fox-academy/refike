import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        System.out.println(countLines("hello.txt"));

    }

    public static int countLines (String name){
        int counter =0;
        try {
            Path filePath = Paths.get(name);
            List<String> myList = Files.readAllLines(filePath);
            for (String lines : myList) {
                counter++;
            }
        } catch (Exception ex){

            return 0;
        }
        return counter;
    }
}
