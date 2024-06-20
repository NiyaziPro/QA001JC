package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.(Structured)

        List<Integer> mylist = new ArrayList<>(Arrays.asList(12, 34, 53, 67, 7, 9, 4, 1, 15));

        //ciftleriYazdir1(mylist);
        ciftleriYazdir2(mylist);


    }

    public static void ciftleriYazdir1(List<Integer> mylist) {
        for (Integer w : mylist) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    //  yazdiran method'u olusturunuz.(Functional)
    //Stream API'si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
    //1) filter(): Koşulu karşılayan elemanları filtreler.
    public static void ciftleriYazdir2(List<Integer> mylist) {

        mylist.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.print(t+" "));
    }
}
