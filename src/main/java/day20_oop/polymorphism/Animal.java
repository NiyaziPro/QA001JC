package day20_oop.polymorphism;

public class Animal {
    /*Object Yönelimli Programlamanın Faydaları:
        1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
        2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
        ile çalıştırılabilir. Substring() method'u 1 kere yazilmis ama surekli kullanabiliyoruz.
        3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
        4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
        5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class' ta değişiklik
        yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/

    /* OOP'leri 4 temel özellikte inceleyebiliriz.
            1. Inheritance - Miras Alma
            2. Polymorphism - Çok Biçimlilik
            3. Encapsulation - Kapsülleme
            4. Abstraction - Soyutlama
                                                                */

    // 1. Inheritance - Miras Alma - extends dedigimiz keyword ile kullanilir
    /*
    Java programlama dilinde "inheritance" (miras alma) bir nesne yönelimli programlama (OOP) kavramıdır.
     Miras alma, bir sınıfın (class) diğer bir sınıftan özelliklerini ve davranışlarını devralması anlamına gelir.
     Java'da, miras alma, bir sınıfın başka bir sınıftan türetilmesiyle gerçekleşir.

        Inheritance'in Faydalari nelerdir?

        1) Kodun yeniden kullanılmasına yardımcı olur.
        2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
        emekten tasarruf sağlayabiliriz.
        3) Kolayca update yapabiliriz.
        4) Class'lari kuculturuz.
        5) Daha az geliştirme ve bakım maliyetine yol açar.
        */


    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink water...");
    }






}
