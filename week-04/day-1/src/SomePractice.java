import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomePractice {
    public static void main(String[] args) {
        Path filePath = Paths.get("hello.txt");

        String input = "Hello szia";

        List<String> inputList = new ArrayList<>(Arrays.asList("Hello2", "Hello3"));

        try {
            Files.write(filePath, inputList);

            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (IOException exceptionName) {
            exceptionName.printStackTrace();
            System.out.println("file cannot be found");


        //runtime error = f.e an infinite loop can be
        //Syntax error
        //Semantic error: logical error basically
        //Exceptions: IOexceptions, NullpointExceptions there are a different types of exceptions
        // finally: it will always run

        } finally {
            System.out.println("this block finally happened");
        }

    }
}
