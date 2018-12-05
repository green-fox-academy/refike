import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        try {

            Path filePath = Paths.get("C://Users/Refike/greenfox/reversed-order.txt");
            List<String> myList = Files.readAllLines(filePath);
            List<String> reversedLines = new ArrayList<>();

            reversedLines.add(reversedOrder(myList));
            System.out.println(reversedOrder(reversedLines));
        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static String reversedOrder (List<String> mylist){
        String sentence = "";
        for (String lines : mylist) {
            for (int j = 0; j < lines.length(); j++) {
                sentence += lines.charAt(lines.length() - 1 - j);
            }

        }
        return sentence;
    }

}
