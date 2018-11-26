import java.util.Scanner;

public class CowsAndBulls {
    int goalToGuess;
    boolean playing;
    boolean finished;
    int counter;


    public CowsAndBulls() {
        this.goalToGuess = (int) (Math.random() * ((9999-1000)+1))+1000;
        this.playing = true;
        this.finished = false;
        this.counter = 0;
    }


    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (this.playing) {
            int guessedDigit = scanner.nextInt();


        }
    }
}