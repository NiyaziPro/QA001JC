package day20_oop.odev;

public class Programs extends TechProEducation {
    public Programs() {
    }

    public Programs(int a) {
        System.out.println("Software Development");
    }

    public Programs(String program) {
        System.out.println(program);
    }

    @Override
    public void email() {

        System.out.println("infoprograms@techproeducation.com");
    }
}
