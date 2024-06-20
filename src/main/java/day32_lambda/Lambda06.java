package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06 {
    public static void main(String[] args) {

        List<Integer> numb = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 10));

        tekrarsizCiftKare(numb);

    }
        //1)Bir list'teki “tekrarsiz","cift " elemanlarin "karelerinin"
        // "toplamını" hesaplayan method oluşturun
    //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger

    public static void tekrarsizCiftKare ( List<Integer> numb){
        int toplam = numb.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).reduce(0,(t,u)->t+u);
        //  numb.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, Integer::sum);
                                                                            // Integer::sum => Method Reference
        System.out.println(toplam);
    }
    /*  Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
        Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
        Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/


}
