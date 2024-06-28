package day37_lambda_practice2;

import day34_lambda.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) throws IOException {
        //Ornek 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.


        Path path = Paths.get("src/main/java/day36_lambda_practice/LambdaTextFile.txt");
        Files.lines(path).forEach(System.out::println);

        long numberOfLetters = Files.lines(path).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();

        System.out.println(numberOfLetters); // 267

        //Ornek 6: Verilen text file icindeki text'de kullanilan tum harfleri tekrarsiz olarak
        // natural order’da (a'dan z'ye) bir listin icinde return eden kodu yaziniz.

        List<String> letters = Files.lines(path).
                map(t->t.replaceAll("[^a-zA-Z]","").split("")).
                flatMap(Arrays::stream).
                distinct().
                sorted().
                toList();

        System.out.println(letters);

    }
}
