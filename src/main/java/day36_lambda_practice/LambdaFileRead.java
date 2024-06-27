package day36_lambda_practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class LambdaFileRead {
    public static void main(String[] args) throws IOException {

        //Ornek 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
            /*
        a) lines,Files sınıfına ait bir metottur.Belirtilen bir dosya yolundan satır satır
        veri okumak için bir Stream<String> döndürür.Bu sayede dosyadaki her satır üzerinde
        akış işlemleri yapabilirsiniz.
        b) Paths.get, Paths sınıfının statik bir metodudur.
        Verilen dosya yolu dizgesini (string) temsil eden bir Path nesnesi döndürür.
        Bu Path nesnesi, dosya ve dizin işlemleri için kullanılır. (oralara ulasimi saglar)*/

        Path path = Paths.get("src/main/java/day36_lambda_practice/LambdaTextFile.txt");
        Files.lines(path).forEach(System.out::println);

        //Ornek 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran kodu yaziniz.

        Files.lines(path).map(String::toUpperCase).forEach(System.out::println);

        //Ornek 3: Verilen text file icindeki text'lerde "Veli" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean result1 = Files.lines(path).anyMatch(t -> t.contains("Veli"));
        System.out.println(result1); // false

        List<String> words = Files.lines(path).
                map(t->t.replaceAll("\\p{Punct}","").
                        split(" ")).
                        flatMap(Arrays::stream).
                        distinct().
                        toList();

        System.out.println(words);


    }
}
