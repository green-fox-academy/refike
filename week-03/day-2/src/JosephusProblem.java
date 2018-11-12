import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number of players: ");
        int numberOfPeople = scanner.nextInt();

        josephus(numberOfPeople);

    }

    public static void josephus(int a) {
        int winner = 0;
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            myList.add(i);

        }

        while (myList.size() >= 2) {

            if (myList.size() % 2 == 0) {
                for (int i = 0; i < myList.size(); i++) {
                    System.out.print(myList.get(i) + " ");
                    myList.remove(i + 1);

                }
                winner = myList.get(0);

            } else {
                for (int j = 0; j < myList.size(); j++) {
                    System.out.print(myList.get(j) + " ");
                    if(myList.size()>j+1){
                        myList.remove(j + 1);
                }
            }

            myList.add(0, myList.get(myList.size() - 1));
            myList.remove(myList.size() - 1);
            }
        }

        System.out.println("The winning position is: " + winner);
    }
}



