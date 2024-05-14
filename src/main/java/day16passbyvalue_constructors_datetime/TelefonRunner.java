package day16passbyvalue_constructors_datetime;

public class TelefonRunner {
    public static void main(String[] args) {
        Telefon telefon1 = new Telefon("Iphone", "15 Promax", "Altin", 4);
        System.out.println("Telefon 1 : " + telefon1);

        Telefon telefon2 = new Telefon("Samsung", "Note 10 Pro", "Beyaz", 2);
        System.out.println("Telefon 2 : " + telefon2);
    }
}
