package day13arrayArraylist;

public class Arrays08 {
    public static void main(String[] args) {
        //Ornek 1: int turunde bir Multidimensional Array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int[][] arrays = {{1, 2, 3, 4}, {5, 4, 2, 1}, {8, 9, 7, 0}};

        int min = arrays[0][0];
        int max = arrays[0][0];

        for (int[] a : arrays) {
            for (int e : a) {
                min = Math.min(e, min);
                max = Math.max(e, max);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println(max + min);

    }
}
