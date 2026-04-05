package minibliblioteka;

public class Main {
    public static void main(String[] args) {
        Ksiazka ks1 = new Ksiazka("Ja","Wariacje",1000,true);
        Ksiazka ks2 = new Ksiazka("On","Obligacje w domu",500,true);
        Ksiazka ks3 = new Ksiazka("Ona","Kwitnące magnolie",700,true);
        Ksiazka ks4 = new Ksiazka("My","Ogień",100,true);
        ks1.borrowBook();
        ks1.borrowBook();
        ks1.returnBook();
        ks1.borrowBook();

    }
}
