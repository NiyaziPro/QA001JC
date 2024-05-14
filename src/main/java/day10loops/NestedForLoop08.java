package day10loops;

public class NestedForLoop08 {
    public static void main(String[] args) {
        /*
         *****
         *
         *****
         *
         *****
         */

        int satir = 5;
        for (int i = 1; i <= satir; i++) {
            if (i == 1 || i == satir - satir / 2 || i == satir) {


                for (int j = 1; j <= satir; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
