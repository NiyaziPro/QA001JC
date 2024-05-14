package Mentoring;

import java.util.Scanner;

public class TestSorulari10 {
    public static void main(String[] args) {

        /*
        Asagıdaki seçenekler dogrultusunda gereken kodu yazınız.
            a) Aralık, Ocak, Subat için "Kıs"
            b) Mart, Nisan, Mayıs için "Ilkbahar"
            c) Haziran, Temmuz, Agustos için "Yaz"
            d) Eylül, Ekim, Kasım için "Sonbahar"
            e) Digerleri için "Geçersiz ay adı"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir ay ismi girin : ");
        String month = scanner.next();

        if (month.equalsIgnoreCase("Aralık") ||
                month.equalsIgnoreCase("Ocak") ||
                month.equalsIgnoreCase("Subat")) {
            System.out.println("Kis");
        } else if (month.equalsIgnoreCase("Mart") ||
                month.equalsIgnoreCase("Nisan") ||
                month.equalsIgnoreCase("Mayis")) {
            System.out.println("Ilkbahar");
        } else if (month.equalsIgnoreCase("Haziran") ||
                month.equalsIgnoreCase("Temmuz") ||
                month.equalsIgnoreCase("Austos")) {
            System.out.println("Yaz");
        } else if (month.equalsIgnoreCase("Eylul") ||
                month.equalsIgnoreCase("Ekim") ||
                month.equalsIgnoreCase("Kasim")) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("Gecerli bir ay ismi giriniz!");
        }

        month = month.toLowerCase();
        switch (month) {
            case "aralik", "ocak", "subat":
                System.out.println("Kis");
                break;
            case "mart", "nisan", "mayis":
                System.out.println("Ilkbahar");
                break;
            case "haziran", "temmuz", "austos":
                System.out.println("Yaz");
                break;
            case "eylul", "ekim", "kasim":
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecerli bir ay ismi giriniz!");
        }
    }
}
