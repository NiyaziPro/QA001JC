package day34_lambda;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        int sum = getSumFromSevenToSeventy();
        System.out.println("sum = " + sum);

        System.out.println("getMultiplicationFromThreeToNine() = " + getMultiplicationFromThreeToNine());
        System.out.println("getMultiplicationFromThreeToNine2() = " + getMultiplicationFromThreeToNine2());


    } //1 . 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy(){
        // a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream’de var)
       // b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
       // temsil eden bir akış oluşturur.
        // c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
        //d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
        // e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.
        // (IntStream kullaninca bunu kullaniriz)
        //Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.

        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

    // 2. 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz
    public static int getMultiplicationFromThreeToNine(){
        //multiplyExact - İki int veya long değerini çarpar. Math class'tadir
       //1.yol
        return IntStream.
                rangeClosed(3,9).
                reduce(Math::multiplyExact).
                getAsInt();
    }
    public static int getMultiplicationFromThreeToNine2(){
        //multiplyExact - İki int veya long değerini çarpar. Math class'tadir
        //1.yol
        return IntStream.
                rangeClosed(3,9).
                reduce(1,Math::multiplyExact);
    }

}
