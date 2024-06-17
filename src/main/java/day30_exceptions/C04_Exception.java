package day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_Exception {
    public static void main(String[] args) {

        /*
            1) finally bloğu genellikle;
             a) Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi, close() methodu ile),
                 Özellikle eski Java versiyonlarında (Java 7 öncesi), veritabanı bağlantıları gibi kaynaklar
                 manuel olarak kapatılmalıydı. Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz
                 yere yer kaplar ve potansiyel performans sorunlarına neden olabilir. Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile)

             b) Dosyaların kapatılması :  (az once dosya baglantisi yapmistik.  fis.close(); ile kapatilabilirdi)
                Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. Aksi halde, dosya kolları
                 gereksiz yere sistemde yer kaplar.

             c) Her durumda çalıştırılması gereken temizleme işlemleri :
             (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir sürecin sonunda her zaman yapılmalıdır.
             Örneğin, bir log dosyasına her işlemin başlangıç ve bitiş zamanını kaydetmek gibi. BufferedWriter ile)

             finally icin bir senaryo olusturalim; a/b bolumu ile bir index bulalim ve bu index'i kullanarak
             Array'deki elemani bulalim

                 */

        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9, 11};

        //getir(c, a, b);



    }

    public static void getir(int[] c, int a, int b) {
        try {
            int index = a / b; // ArithmeticException
            int element = c[index]; //ArrayIndexOutOfException
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println("Burada bir aritmatik exception var : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Burada baska bir exception var : " + e.getMessage());
            e.printStackTrace();
        } finally { // kullaniciya bir bilgi vermek icin hata olsa yada olmasa bile calisan
            System.out.println("Bu finnaly yapisi nedir?");
        }


    }

    /*Java'da final, finally ve finalize() terimleri farklı amaçlarla kullanılan üç farklı kavramı temsil eder.
 final:
   Değişkenler İçin: final keyword'uyle tanımlanan bir variable sadece bir kez değer alabilir.
   Bu, değişkenin değerinin sonradan değiştirilemeyeceği anlamına gelir. Yani, bu değişken sabittir (constant)
   Metotlar İçin: final keyword'uyle tanımlanan bir metot, child class'lar tarafından
   override edilemez.
   Class'lar İçin: final keyword'uyle tanımlanan bir class, genişletilemez (extend edilemez).
   Yani bu class'in child'i olmaz.

 finally:
   finally bloğu, try-catch yapısının bir parçasıdır. Bu blok, try bloğunda bir istisna oluşsa da
   oluşmasa da her zaman çalıştırılır.Genellikle kaynakların serbest bırakılması,
   dosyaların kapatılması gibi temizleme işlemleri için kullanılır.

 finalize():
   Bu, Object sınıfında tanımlanan bir metottur ve varsayılan olarak hiçbir işlem yapmaz.
   Bir nesne bellekten kaldırılmadan hemen önce Garbage Collector (Çöp Toplayıcı) tarafından
   otomatik olarak çağrılır. Genellikle dış kaynakların serbest bırakılması için kullanılır,
   ancak modern Java uygulamalarında kullanımı önerilmez.*/

}
