package sorular;

import java.util.Arrays;

public class C12_soru {
    public static void main(String[] args) {


        //3.soru Verilen arrayin tum elemanlarini bir soldaki konuma tasiyacak
        //bir program yazin. Ornek; array ((1,2,3)) ise output (2, 3, 1) olacak

        String[] arr1 = {"a", "b", "c", "d", "f"};
        String ilkIndex = arr1[0];
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = ilkIndex;
        System.out.println(Arrays.toString(arr1));


    }
}
