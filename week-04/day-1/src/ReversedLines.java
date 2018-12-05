import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        try {
            Path filePath = Paths.get("C://Users/Refike/greenfox/reversed-lines.txt");
            List<String> myList = Files.readAllLines(filePath);
            System.out.println(reversedLines(myList));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String reversedLines(List <String> myList) {
        String sentence = "";
        for (String lines : myList) {
            for (int j = 0; j < lines.length(); j++) {
                sentence += lines.charAt(lines.length() - 1 - j);
            }

        }
        return sentence;
    }
}
