package sorular;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        // girilen sayidan baslayarak -50' kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz :");
        int num = input.nextInt();

        int sum = 1;
        for (int i = num; i > -50; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
