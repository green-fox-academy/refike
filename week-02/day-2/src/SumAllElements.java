public class SumAllElements {
    public static void main(String[] args) {
        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`

        int[] ai = {3,4,5,6,7};
        int sum =0;

        for (int i=0; i<ai.length; i++) {

            sum += ai[i];
        }
            System.out.println(sum);
        }
    }
//    public static int addElements (int myInt) {
//        int total = 0;
//        total += myInt;
//      return total;
//    }


