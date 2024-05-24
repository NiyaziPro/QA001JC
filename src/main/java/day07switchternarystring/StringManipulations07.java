package day07switchternarystring;

public class StringManipulations07 {
    public static void main(String[] args) {
        //  Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //  String tv = "$456.99";  String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        // valueOf() : belirtilen String degeri double'a cevirir

        String tv = "$456.99";
        String laptop = "$875.99";
        // fiyat etiketinin icinde bulunan dollar isaretini yok saymaliyim yani silmeliyiz

        tv = tv.replace("$", "");
        System.out.println("tv = " + tv);

        laptop = laptop.replace("$", "");
        System.out.println("laptop = " + laptop);

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println("totalPrice = " + totalPrice); // totalPrice = 1332.98


        // Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console'a yazdiriniz.
        //                       "   ali cAN   " ==> AC

        String name = "   ali cAN kaya  ";
        // trim() : methodu bastaki ve sondaki bosluklari siler
        // split() : methodu Stringi istenen karakterden parcalamayi saglar

        char firstChar = name.trim().toUpperCase().charAt(0);
        System.out.println("firstChar = " + firstChar);

        char secondChar = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("secondChar = " + secondChar);

        System.out.println("" + firstChar + secondChar);

        char char3 = name.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println("secondChar = " + char3);

        System.out.println("" + firstChar + secondChar+char3);


    }
}
