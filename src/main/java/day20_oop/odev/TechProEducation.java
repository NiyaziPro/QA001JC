package day20_oop.odev;

public class TechProEducation {
    public String schoolName = "TechProEducation";
    public String type = " << Courses in the field of IT >> ";
    String contact = "+1 585 304 19 59";
    String email = "info@techproeducation.com";
    boolean certificate = true;

    public TechProEducation() {
        System.out.println(schoolName);
        System.out.println(type);
        System.out.println("Contact : "+contact);
        System.out.println("E-mail : "+email);
    }
    public void email (){
        System.out.println( "E-mail for info : info@techproeducation.com");
    }
}
