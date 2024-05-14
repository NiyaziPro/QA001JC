package day18_dateTime_StringBuilder;

public class C06_AccessModifier {

    // Her classtan kullanilabilir
    public String name = "";

    // protected baska package'lardan sadece child class'lardan gorulebilir
    protected String adress = "Istanbul";

    // default keyword yazilmaz, zaten dafault'tir

    //default
    String email = ""; // baska package'larda kullanilamaz

    // private olanlar sadece olusturduklari classtan gozukur ve kullanilabilir
    private String tcKNo = "1234567890";


        /*
         1)public
         2)protected
         3)default
         4)private

         public > protected > default > private

         public     ==> public olanlar her class'dan kullanilabilir
         protected  ==> protected olanlar baska package'lardan kullanilamaz, ancak baska package'larda child classlar icinden kullanilabilir
         default    ==> default olanlar baska package'lardan kullanilamazlar
         private    ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

         Soru: "protected ile default" arasindaki farki söyleyiniz?
          Cevap: protected olanlar baska package'lardan kullanilamaz ancak baska package'larda
         child classlar icinden kullanilabilir. default olanlar baska package'lardan kullanilamazlar
 */


}
