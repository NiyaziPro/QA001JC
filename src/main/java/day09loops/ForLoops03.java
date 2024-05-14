package day09loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(20 dahil)
        //1.yol
        for (int i = 3; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------");

        //2.yol

        for (int i = 4; i < 21; i += 2) {
            System.out.print(i + " ");
        }
    }
}
