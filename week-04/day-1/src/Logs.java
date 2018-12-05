import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        try {
            Path filePath = Paths.get("C://Users/Refike/greenfox/log.txt");
            List<String> myList = Files.readAllLines(filePath);
            ArrayList<String> myArray = new ArrayList<>();
            ArrayList<String> mySecondArray = new ArrayList<>();
            for (int i = 0; i <myList.size() ; i++) {
                myArray.add(myList.get(i).split("\\s+")[5]);
                // veszi a lista i- sorát mindig, szét szedi a white spaceknél \\s+ ez esetben egynél több white space
                // majd fogja az 5. indexnél lévő részét az array[]-nek ez esetben az IP címek
                mySecondArray.add(myList.get(i).split("\\s+")[6]);
            }
           // System.out.println(mySecondArray);
            System.out.println(uniqueIP(myArray));
            System.out.println(ratio(mySecondArray));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static ArrayList<String> uniqueIP ( ArrayList <String> myIPS){
        for (int i = 0; i < myIPS.size()-1; i++) {
            for (int j = i+1 ; j < myIPS.size(); j++) {
                if (myIPS.get(i).equals(myIPS.get(j))) {
                    myIPS.remove(j);
                }
            }
        }
        return myIPS;

    }
   public static String ratio (ArrayList<String> ratio) {
        int numberPost = 0;
        int numberGet = 0;
        String ratioNum = "";

       for (int i = 0; i <ratio.size() ; i++) {
           if (ratio.get(i).equals("POST")){
               numberPost++;
           } else {
               numberGet++;
           }
       }

       ratioNum +=  numberPost + "/" + numberGet;

       return ratioNum;
    }

}

