package day22_oop.abstractClass.konuIcinOrnek;

public abstract class Honda {

    /*
     * 4- Abstraction(Soyut)
     * Abstraction iki bolumden olusur.
     * i) Abstract Class:
     * Kendisinden object olusturulmaz. Bazi class'lari obje olusturmak amaciyla degil,
     * objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
     * Baslangic degil, sonuctur.
     * <p>
     * 1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.
     * <p>
     * 2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut) method denir
     * <p>
     * 3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.
     * <p>
     * 4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
     * <p>
     * 5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.
     * <p>
     * 6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
     */
    /*Final Class'lar: Bir class final olarak işaretlendiğinde, bu class başka hiçbir class tarafından genişletilemez (extend edilemez)
        yani miras alınamaz. Bu, final sınıfların alt sınıfları olamayacağı anlamına gelir.
        Bu nedenle, final class'lar abstract olamaz çünkü abstract sınıflar genişletilmek ve
        abstract metodları implement etmek üzere tasarlanmışlardır.*/

    public abstract void engine();

    public void music() {
        System.out.println("Pro");
    }


}
