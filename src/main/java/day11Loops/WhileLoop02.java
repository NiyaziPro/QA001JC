package day11Loops;

public class WhileLoop02 {
    public static void main(String[] args) {
        // Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil)


        for (int i = 23; i >= 12; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();


        int i = 23;
        while (i > 11) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
            i--;
        }



    }
}
