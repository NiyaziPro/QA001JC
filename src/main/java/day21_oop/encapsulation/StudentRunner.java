package day21_oop.encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name);

        System.out.println(s.getAge());

        System.out.println(s.isSuccesful());

        s.setAge(35);
        System.out.println(s.getAge());

        s.setSuccesful(false);
        System.out.println(s.isSuccesful());


        /**Soru 2:  encapsulation'da set ile verileri degistirebiliyoruz. constructorlar ile de degistirebiliyoruz. farki nedir?
         Cevap 2: setter metodları mevcut bir nesnenin verilerini değiştirmek için kullanılırken, constructorlar yeni nesnelerin
         başlangıç durumunu belirlemek için kullanılır. İkisi de encapsulation'ın bir parçasıdır ve sınıfın verilerinin güvenli
         bir şekilde yönetilmesine yardımcı olur.*/

    }

}
