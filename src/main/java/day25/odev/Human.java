package day25.odev;

public class Human {
    String name;
    String surname;
    int yas;
    String gender;

    public Human(String name, String surname, int yas, String gender) {
        this.name = name;
        this.surname = surname;
        this.yas = yas;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yas=" + yas +
                ", gender='" + gender + '\'' +
                '}';
    }
}
