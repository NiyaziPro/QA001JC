package day12arrays;

import java.util.Arrays;

public class Arrays06 {
    public static void main(String[] args) {
        //Ornek 2: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //String s = "Java is easy. Learn Java earn money.";
        String s = "Java is easy. Learn Java earn money.";

        //dynamic olmaz hard coding olur
        String []words1=new String[7];
        words1[0]=s.split(" ")[0];
        words1[1]=s.split(" ")[1];
        words1[2]=s.split(" ")[2];


        System.out.println(Arrays.toString(words1));
        //daha dinamik bir yapı
        String[] words=s.split(" ");
        System.out.println(words.length);//10


    }
}
