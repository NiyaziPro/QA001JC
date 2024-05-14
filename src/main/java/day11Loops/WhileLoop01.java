package day11Loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Ornek 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz (3 ve 6 dahil)

        for (int i = 3; i <= 6; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        // dogru oldugu surece  calismaya devam eder
        int i = 3;
        while (i < 7) {
            System.out.print(i+" ");
            i++;
        }


    }
}
