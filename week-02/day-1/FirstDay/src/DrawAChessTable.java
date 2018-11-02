public class DrawAChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %

        int number = 8;

        for (int c = 1; c <= number; c++) {

            if (c % 2 != 0) {

                for (int i = 1; i <= number; i++) {

                    if (i % 2 != 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");

                    }


                }
                System.out.print("\n");
            } else {
                for (int l = 1; l <= number; l++) {

                    if (l % 2 != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }

                }
                System.out.print("\n");
            }
        }
    }
}

