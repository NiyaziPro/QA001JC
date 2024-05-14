package day10loops;

public class NestedForLoop06 {
    public static void main(String[] args) {
         /*
                * * * * .
                * * * . .
                * * . . .
                * . . . .
                . . . . .
         */

        for (int satir = 1; satir <= 5; satir++) {
            for (int sutun = 4; sutun >= satir; sutun--) {
                System.out.print("* ");
            }
            for (int i = 1; i <= satir; i++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
