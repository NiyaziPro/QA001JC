package Mentoring;

import java.util.Random;

public class TestSorulari19 {
    public static void main(String[] args) {
        // 23'ten 12'ye(dahil) kadar cift tamsiyali yazdirin
        int i = 23;
        while (i > 11) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();


        Random random = new Random();
        int r = random.nextInt(20, 30);
        System.out.println(r);
    }
}
