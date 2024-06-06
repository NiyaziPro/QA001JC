package day28_exceptions;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        int[] arr = {1, 2, 3, 4, 5, 6};

        //indexArray(arr,10); // ArrayIndexOutOfBoundsException

        arrayElemanGetir(arr); // ArrayIndexOutOfBoundsException

        System.out.println("Kodlarimiz calismaya devam ediyor...");

    }

    public static void indexArray(int[] arr, int index) {

        try {
            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Olmayan indexleri kullanmayiniz : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void arrayElemanGetir(int[] arr) {
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Arrayin disinda bir elemana ulasmaya calistiniz : " + e.getMessage());
            e.printStackTrace();

        }
    }

}
