import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {

        // Create a method that decrypts the duplicated-chars.txt

        try {
            Path filePath = Paths.get("C://Users/Refike/greenfox/duplicated-chars.txt");
            List<String> myList = Files.readAllLines(filePath);

            System.out.println(duplicated(myList));

            } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public static String duplicated(List <String> myList) {
        String quote = "";

        for (String line : myList) {
            for (int j = 0; j < line.length(); j += 2) {
                quote += line.charAt(j);

            }
        }

        return quote;

    }

}