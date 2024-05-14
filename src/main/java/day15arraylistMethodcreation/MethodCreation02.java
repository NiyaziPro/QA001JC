package day15arraylistMethodcreation;

public class MethodCreation02 {
    public static void main(String[] args) {
        String renk = "Yesil";
        String turu = "Kulplu";
        boolean iciDoluMu;
        iciDoluMu=suDoldur();
        System.out.println("iciDoluMu = " + iciDoluMu);
        iciDoluMu=suyuBosalt();
        System.out.println("iciDoluMu = " + iciDoluMu);



    }
    public static boolean suDoldur(){
        System.out.println("Su dolduruluyor");
        return true;
    }
    public static boolean suyuBosalt(){
        System.out.println("Su bosaltiliyor");
        return false;
    }


}
