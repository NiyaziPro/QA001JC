package day10loops;

public class NestedForLoop09 {
    public static void main(String[] args) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        int satir1 = 5;

        for (int i = 1; i <= satir1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int satir2 = 4;
        for (int i = 1; i <= satir2; i++) {
            for (int j = satir2; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
