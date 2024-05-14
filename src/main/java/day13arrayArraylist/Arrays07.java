package day13arrayArraylist;

import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
        //
        // Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}, {4, 5, 6, 4}};
        //1. adım yeni bir array'e ihtiyacimiz var evet yeni bir array'e ihtiyacimiz var
        //fakat bu yeni arrayin eleman sayisi multi dimensional arrayin eleman sayisi ile ayni olmali
        //yani bu durumda bize numbers adlı arrayin toplam eleman sayisi lazım

        int toplamElemanSayisi = 0;
        for (int[] a : numbers) {
            System.out.println(a.length);
            toplamElemanSayisi += a.length;
        }
        System.out.println("toplamElemanSayisi = " + toplamElemanSayisi);

        int[] newArr = new int[toplamElemanSayisi];

        //2. adım olarak artık yeni olusturdugumuz array'e eski arrayimizden elemalari eklememiz lazım

        // 2. adim
        int idx = 0;
        for (int[] w : numbers) {
            for (int a : w) {
                newArr[idx] = a;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}
