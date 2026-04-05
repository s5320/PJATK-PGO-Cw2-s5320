package minibliblioteka;

public class Main {
    public static void main(String[] args) {
        Ksiazka ks1 = new Ksiazka("Ja","Wariacje",1000,true);
        Ksiazka ks2 = new Ksiazka("On","Obligacje w domu",500,true);
        Ksiazka ks3 = new Ksiazka("Ona","Kwitnące magnolie",700,true);
        Ksiazka ks4 = new Ksiazka("My","Ogień",100,true);
        Czytelnik cz1 = new Czytelnik("Filip", "Sarp",100);
        Czytelnik cz2 = new Czytelnik("John", "Doe",101);
        // błędny czytelnik Czytelnik cz1 = new Czytelnik("Filip", "Sk",0);
        //ks1.borrowBook();
        //ks1.borrowBook();
        //ks1.returnBook();
        //ks1.borrowBook();
        cz1.printData();
        cz1.incBookRental();
        cz2.printData();
        cz2.incBookRental();
        cz1.printData();
        cz2.printData();
        cz1.decBookRental();

    }
}
