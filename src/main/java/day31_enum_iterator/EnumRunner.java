package day31_enum_iterator;

import day30_exceptions.Cities;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        // Cities c = new Cities();   Enum'lardan object olusturamazsiniz

        //1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.ANTALYA;
        System.out.println(il); //ANTALYA //ifadesi, aslında arka planda il nesnesinin toString() methodunu cagirir.
        //toString metodu, enum degerinin adini (name()) dondurur.

        //2- BURSA sabitinin ismine ulasalim

        String city = Cities.BURSA.getCityName();
        System.out.println(city);

        //3- Ankara'nin posta koduna ulasalim

        System.out.println(Cities.ANKARA.getPostalCode());

        //4- Karabuk'un plaka koduna ulasalim

        int plakaNo = Cities.KARABÜK.getPlateCode();
        System.out.println(plakaNo);

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodu girin : ");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir
        //81 tane switch-case yapmaktan kurtulduk
        Cities[] sehirler = Cities.values();

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1-81 arasi bir plaka kodu giriniz!");
        } else {
            for (Cities w : sehirler) {
                if (plaka == w.getPlateCode()) {
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline sahiptir");
                    break;
                }
            }
        }

//        for (Cities w : sehirler){
//            if (plaka==w.getPlateCode()){
//                System.out.println(w.getCityName());
//            }
//        }


    }
}
