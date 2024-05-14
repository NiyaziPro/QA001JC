package day12arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        String[] isimler = new String[3];
        System.out.println(Arrays.toString(isimler));
        isimler[0] = "Ali Can";
        isimler[1] = "Esra Hanim";
        isimler[2] = "Niyazi Bey";
        // isimler[3] = "Ahmet Hoca";  uc eleman dendigi icin 4. elemanı yerlestiremedik ve hata aldık
        System.out.println(Arrays.toString(isimler));
        System.out.println(isimler[2]);
        isimler[2] = "Ahmet Hoca"; //yani eleman degistirmede herhangi bir sinirlama yoktur
        System.out.println(isimler[2]);
        System.out.println(Arrays.toString(isimler));
    }
}
