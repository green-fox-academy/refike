public class DrawChessTableVersionTwo {
    public static void main(String[] args) {

        int number = 8;

        for (int i=1; i<=number/2; i++){
            for (int j=0; j<number/2; j++) {
                System.out.print("% ");
            }
            System.out.print("\n");
            for (int k=0; k<number/2; k++) {
                System.out.print(" %");
            }
            System.out.print("\n");
        }
    }
    }

