package day13arrayArraylist;

import java.util.Random;

public class Arrays06 {
    public static void main(String[] args) {

        // bir multi-dimensional array olusturun
        // ve olusturdugunuz arrayin elemanlarini toplamını yazdırınız

        int[][] arr = {{1, 8, 5, 7, 9}, {6, 8, 10}, {15, 16}};

        int toplam = 0;

        for (int[] a : arr) {
            for (int b : a) {
                toplam += b;
            }
        }
        System.out.println(toplam);
    }
}
