import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv

        try {
            Path filePath = Paths.get("C://Users/Refike/greenfox/lottery.txt");
            List<String> myList = Files.readAllLines(filePath);
            ArrayList<String> myArray = new ArrayList<>();
            for (int i = 0; i <myList.size() ; i++) {
                myArray.add(myList.get(i).split("Ft;")[4]);

            }
            System.out.println(lottery(myArray));


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public static Map<String,Integer> lottery (ArrayList <String> myList) {
        Map<String, Integer> lotteryMap = new HashMap();

        for (String item : myList) {
            if (!lotteryMap.containsKey(item)) {
                lotteryMap.put(item, 0);
            }
            lotteryMap.put(item, lotteryMap.get(item) + 1);
        }
    return lotteryMap;
    }

}
