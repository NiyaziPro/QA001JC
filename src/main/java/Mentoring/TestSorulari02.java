package Mentoring;

public class TestSorulari02 {
    public static void main(String[] args) {
        /*

           * * * *
         *
         *
         *
           * * * *


         */
        int satir1 = 5;

        for (int i = 1; i <=satir1 ; i++) {
            if (i==1||i==satir1){
                System.out.print(" ");
                for (int j = 1; j <=satir1 ; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
