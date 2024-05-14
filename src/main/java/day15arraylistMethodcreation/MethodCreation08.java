package day15arraylistMethodcreation;

public class MethodCreation08 {
    public static void main(String[] args) {
        String renk ="Kirmizi";
        String marka = "Brother";
        String model = "J105";

        String str = "Java candir gerisi heyecan";
        yazdirma(str);
        tarama(str);

    }

    public static String yazdirma(String neYazdirilicak){
        System.out.println("Alinan bilgi yaziciya yonlendiriliyor...");
        System.out.println("Alinan bilgi A4 kagidina yazdirilior...");
        System.out.println("Alinan bilgi A4 kagidina yazdirildi...");
        System.out.println(neYazdirilicak);
        return neYazdirilicak;

    }
    public static String tarama(String neTaranacak){
        System.out.println("Taramak istediginiz bilgiyi yaziciya yukleyin");
        System.out.println("Bilgi taraniyor...");
        System.out.println("Bilgi tarandi...");
        System.out.println("Devam etmek icin yeni bilgiyi yaziciya yukleyin");
        System.out.println("Bilgi taraniyor...");
        System.out.println("Bilgi tarandi...");
        System.out.println(neTaranacak);
        return neTaranacak;

    }

}
