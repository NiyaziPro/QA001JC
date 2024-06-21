package day33_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10, 14));
        enKucukCift(myList);

    }

    //8)Verilen List'ten 7’den buyuk en kucuk cift sayiyi bulmak için bir method oluşturun
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi
    public static void enKucukCift(List<Integer> myList) {

        //findFirst(): Sıralı akışta bulunan ilk elemanı (yani yani bu senaryo da en küçük elemanı) alır.
        // Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
        // (filtreleme nedeniyle veya başka bir sebepten dolayı)

        int min = myList.stream().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst().get();

        System.out.println(min);
    }
}
