package day20_oop.odev;

public class SoftwareDevelopment extends Programs {
    String java = "Java Developer";
    String python = "Python Developer";
    String mobile = "Mobile Developer";



    public SoftwareDevelopment() {
        System.out.println("Java Developer");
    }

    public SoftwareDevelopment(String chooseLanguage) {
        super(1);
        System.out.println(chooseLanguage+" Developer");
    }

}
