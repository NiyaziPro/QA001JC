package day32_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
         /*
            Lambda ifadeleri, Java 8 ile birlikte tanıtılan ve fonksiyonel(methodsal) programlamayı
            kolaylaştırmak için kullanılan bir özelliktir.
            Lambda ifadelerinin genel avantajları:
            1- Daha az kod yazma: Lambdalar, daha az ve daha okunabilir kod yazmanızı sağlar.
            2- Fonksiyonel programlama: Java'nın fonksiyonel programlama özelliklerini kullanmanıza yardımcı olur.
            3- İsimsizdir: Lambda ifadeleri, bir isme sahip değildir.(method ismi yoktur)
            4- Tek bir ifade içerebilir: Lambda ifadeleri, bir veya daha fazla işlem gerçekleştiren tek
            bir ifade içerebilir.
            5- Bir veya daha fazla parametre alabilir*/
                /*1) Lambda Functional Programming'dir, digeri "Structured Programming" dir
            Structured Programming: Yapısal programlama, programların belirli yapılar veya kontrol yapıları
            (örneğin döngüler, şartlı ifadeler) kullanılarak yazılmasını teşvik eden bir programlamadir.
            2) Functional programming, Collection'lar ve Array'ler ile yaygin olarak kullanilir.(Map'lerde direkt kullanilmaz
            entrySet ile Set'e cevrilirse kullanilabilir)*/

    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(12,34,53,67,7,9,4,1,15));
        //printElements1(mylist);
        printElements2(mylist);

    }
    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured == Yapisal)

    public static void printElements1(List<Integer>numb){//soldaki @ uyarisi,ilgili parametrenin hicbir zaman
        // null olmamasi gerektigini belirmek icin @NotNull anotasyonunun eklenmesini onerir
        //bu anotasyon, genellikle jetbrains'in sundugu anotasyon kutuphanesi ile birlikte gelir ve kodun okunabilirligini artırır

        for (Integer w:numb
        ) {
            System.out.print(w+" ");
        }
    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    //yazdiran method'u olusturunuz.(Functional)

    public static void printElements2(List<Integer>numb){
        //stream() metodu, koleksiyonları bir akışa (stream) dönüştürerek üzerinde işlem yapmayı sağlar.
        //Akışın (stream) adı, verinin bir kaynaktan hedefe doğru "akmasını" ifade eder.
        numb.stream().forEach(t -> System.out.print(t+"* "));//t degiskenin adidir(type'dan gelir)

        //Eğer sadece bir forEach işlemi yapılacaksa, stream()'i kullanmak zorunlu değildir,
        // doğrudan koleksiyon üzerinde de forEach kullanılabilir.
        // Ancak, birden fazla işlemi birleştirmek veya daha karmaşık işlemler yapmak için
        // Stream API'sini kullanmak daha uygundur.

    }
}
