package day22_oop.interfaceClass;

public class AudiA4 implements Motor, Klima, Fren {

    /*
        a) interface'leri parent yapmak icin 'implements' keyword'u child icinde kullanilir

        b) extends kullanilmaz cunku bu iki class arasinda kullanilir

        c) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorundadir.

        d) AudiA4 Class'i, Motor interface'i icindeki tum methodlari override etmek zorunda
        oldugundan method'larin bas kismina 'override' yazmak gerekmez bu yuzden yazmayiz.

        e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
        */

    @Override
    public void eco() {

        System.out.println("Audi A4 ekonomik motor kullanir");
    }

    @Override
    public void turbo() {
        System.out.println("Audi A4 turbo motor kullanir");
    }

    @Override
    public void gas() {
        System.out.println("Audi A4 benzinli motor kullanir");
    }

    @Override
    public void abs() {
        System.out.println("Audi A4 ABS fren sistemi kullanir");
    }

    @Override
    public void esp() {
        System.out.println("Audi A4 ABS fren sistemi kullanir");
    }

    @Override
    public void analog() {
        System.out.println("Audi A4 analog klima  kullanir");
    }

    @Override
    public void digital() {
        System.out.println("Audi A4 digital klima  kullanir");
    }

    public void run (){
        System.out.println("Audi A4 Hava yastigini acti");
    }


}
