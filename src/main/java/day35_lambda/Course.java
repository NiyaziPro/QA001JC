package day35_lambda;

public class Course {

    //Senaryo: Lambdayi object’lerle kullanmayi ogrenelim.
    // Class icerisinde pasif ve aktif ozellikler olusturalim
    /*
       Icinde
       1) private variable'lar (kapsulleme-encapsulation)
       2) parametreli ve parametresiz constructor'lar
       3) getter'lar -Private değişkenlere erişim sağlamak için-
       4) setter'lar -Private değişkenleri değiştirmek için-
       5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-
       barindiran classlara POJO class denir
       POJO==>Plain Old Java Object -Düz Eski Java Nesnesi
       Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
   */

    private String season;
    private String courseName;
    private double averageScore;
    private int numberOfStudent;

    // Constructor'lar
    public Course() {
    }

    public Course(String season, String courseName, double averageScore, int numberOfStudent) {
        this.season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudent = numberOfStudent;
    }

    // Getter methodlar

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }


    // // Setter methodlar

    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }


    // toString methodu


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
