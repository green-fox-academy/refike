import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("C://Users/Refike/greenfox/win-o.txt");
            List<String> winOList = Files.readAllLines(filePath);
            Path filePath2 = Paths.get("C://Users/Refike/greenfox/win-x.txt");
            List<String> winXList = Files.readAllLines(filePath);
            Path filePath3 = Paths.get("C://Users/Refike/greenfox/draw.txt");
            List<String> drawList = Files.readAllLines(filePath);

            System.out.println(ticTacResult(winOList));
        //    System.out.println(ticTacResult(winOList));
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    public static String ticTacResult (List <String> game) {

        Character[][] myInt = new Character[3][3];
        for (int i = 0; i <myInt.length ; i++) {
            for (int j = 0; j <myInt.length ; j++) {
                myInt[i][j] = game.get(i).charAt(j);
                //System.out.print(myInt[i][j]);
                if(myInt[i].equals("")){
                    System.out.println("O wins");
                }
            }
            System.out.println();

        }
        return null;
        }


    //}
}