package Most;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MostProductiveYear {
    /**
     * Write a method that helps you find the most productive year for a film studio.
     * The method should take one argument, which is the name of the film studio.
     * The method should try to open the related data file named `studioname`.csv,
     * which is a comma separated file with 3 columns: name of the movie, release year, director
     * <p>
     * - If we do not have any data about the studio, the method should return an error message.
     * - If we have found data, the method should return an information message about the most productive year for that studio.
     * <p>
     * Examples:
     * <p>
     * If we call the method with 'marvel':
     * should return 'marvel has made the most movies in 2017.'
     * <p>
     * If we call the method with 'ghibli':
     * should print 'Cannot find studio, please try again later.'
     * <p>
     * Hint:
     * - You can find some example files in this folder (marvel.csv and paramount.csv)
     * - Most productive year: The year in which the studio has made the most movies.
     */
    public static void main(String[] args) {
        String name = "marvel";
        String name1 = "paramount";
        System.out.println("The most productive year was " + mostProdYear(name));

    }

    public static String mostProdYear(String filename) {
        String myString = "";
        try {
            Path filePath = Paths.get("src/" + filename + ".csv");
            List<String> myList = Files.readAllLines(filePath);
            HashMap<String, Integer> myMap = createAMap(myList);


            int maxValue = (Collections.max(myMap.values()));
            for (HashMap.Entry<String, Integer> entry : myMap.entrySet()) {
                if (entry.getValue().equals(maxValue)) {
                    myString += (entry.getKey());
                }
            }


        } catch (Exception ex) {
            System.out.println("We don't have any information about the studio");
            ex.printStackTrace();
        }
        return myString;
    }

    public static HashMap<String, Integer> createAMap(List<String> list) {
        HashMap<String, Integer> myMap = new HashMap<>();
        for (String aList : list) {
            String myString = aList.split(",")[1];
            if (!myMap.containsKey(myString)) {
                myMap.put(myString, 1);
            } else {
                myMap.put(myString, myMap.get(myString) + 1);
            }
        }
        return myMap;
    }
}