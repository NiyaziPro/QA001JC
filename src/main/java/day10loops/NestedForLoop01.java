package day10loops;

public class NestedForLoop01 {
    public static void main(String[] args) {
        /*
            ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
            Week: 1
                Day: 1
                Day: 2
                Day: 3
                .....
            Week: 2
                Day: 1
                Day: 2
                Day: 3
                ....    */

        for (int i = 1; i < 5; i++) {
            System.out.println("Week : " + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("   Day : " + j);
            }
        }

    }
}
