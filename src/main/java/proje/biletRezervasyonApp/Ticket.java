package proje.biletRezervasyonApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class Ticket {
    // 4. yolculuk tipi , yolcu bilgisi, koltuk no, mesafe(km),totalfiyat, yada ticket ilgili bilgiler

    public double distance;
    public int typeNo;
    public String seatNo;
    public double price;

    //  5. bilet fiyatini hesaplayalim

    public void getTotalPrice(int age) {
        int seat = Integer.parseInt(seatNo);
        double toplam = 0;
        switch (this.typeNo) {
            case 1: // Tek yon
                toplam = seat % 3 == 0 ? this.distance * 1.2 : this.distance * 1; //tek koltuk : cift koltuk
                System.out.println("Toplam tutar : " + toplam); // 600 indirimli fiyat
                break;
            case 2: // cift yon
                toplam = seat % 3 == 0 ? this.distance * 2.4 : this.distance * 2;
                System.out.println("Toplam tutar : " + toplam+"TL");
                //cift yon indirim
                toplam = toplam * 0.8;
                System.out.println("Cift yon indirimli total tutar : " + toplam+"TL");
                break;

        } // son tutardan yas indirimi
        if (age < 13) {
            toplam = toplam / 2;
            System.out.println("12 yas alti indirimli total tutar : " + toplam+"TL");
        } else if (age > 64) {
            toplam = toplam * 0.7;
            System.out.println("65 yas ustu indirimli total tutar : " + toplam+"TL");
        }
        this.price = toplam;
    }

    //6. bilet bilgilerini yazdiralim
    public void printTicket(Bus otobus) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a\ndd.MM.yy");
        System.out.println("****************************************");
        System.out.println("<<  Bilet detayi  >>");
        System.out.println("Otobus plakasi : " + otobus.plaka);
        System.out.println("Otobus Firmasi : " + otobus.firma);
        System.out.println("Hangi Peron    : " + otobus.peron);
        System.out.println("Mesafe         : " + this.distance+"km");
        System.out.println("Yolculuk Tipi  : " + (this.typeNo == 1 ? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.println("Koltuk No      : "+this.seatNo);
        System.out.println("Toplam tutar   : "+this.price+"TL");
        System.out.println("<< Keyifli Yolculuklar Dileriz >>");
        System.out.println(dtf.format(dateTime));
        System.out.println("****************************************");
    }


}
