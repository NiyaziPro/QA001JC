package day09loops;

public class ForLoops06 {
    public static void main(String[] args) {
        //  Ornek 3: Verilen bir String'i tersden yazan kodu yaziniz
        //          String t = "Ali Can"; ==> “naC ilA”
        //  Loop olustururken baslangic ve bitis degeri cok onemlidir

        String t = "Ali Can";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.charAt(i);
        }
        System.out.println(ters);

    }
}
