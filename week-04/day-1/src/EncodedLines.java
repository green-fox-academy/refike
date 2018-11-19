import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        try {
            Path filePath = Paths.get("C://Users/Refike/greenfox/encoded-lines2.txt");
            List<String> myList = Files.readAllLines(filePath);
            System.out.println(reversedLines(myList));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static List<String> reversedLines(List<String> myList) {
        List<String> decodedArray = new ArrayList<>();
        for (String line : myList) {
            StringBuilder decodedMessage = new StringBuilder(line);
            for (int i = 0; i < line.length(); i++) {
                int ascii = (int) line.charAt(i);
                if (ascii > 32) {
                    decodedMessage.setCharAt(i, (char) (ascii - 1));

                }
            }

            decodedArray.add(decodedMessage.toString());


        }
        return decodedArray;
    }
}
