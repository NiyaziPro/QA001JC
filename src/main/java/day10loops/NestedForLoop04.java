package day10loops;

public class NestedForLoop04 {
    public static void main(String[] args) {
        //asagidaki sekli yazdirin
        /*
         * * * * * *
         * * * ! * *
         * * ! * * *
         * * * * * *
         */

        for (int satir = 1; satir <= 4; satir++) {
            for (int sutun = 1; sutun <= 6; sutun++) {
                if ((satir == 2 && sutun == 4) || (satir == 3 && sutun == 3)) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }
    }
}
