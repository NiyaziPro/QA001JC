package sorular;

import java.util.Arrays;

public class C25_soru {
    public static void main(String[] args) {
        /*

        Bir array oluşturun.

        Devamında, her bir elemanı, iç array elemanlarının
        toplamına eşit olan tek boyutlu yeni bir array haline getirin.

        Örn:

        int[][] arr = { {3,4}, {7,2}, {9,5} } -->  3,2
        -->
        { 7, 9, 14 }

 */

        int[][] arr = {{3, 4}, {7, 2}, {9, 5}};

        int[] newArr = new int[arr.length];

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k : arr[i]) {
                toplam += k;
            }
            newArr[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
