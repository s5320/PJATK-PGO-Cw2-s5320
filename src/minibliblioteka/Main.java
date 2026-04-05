package minibliblioteka;

public class Main {
    public static void main(String[] args) {
        Ksiazka ks1 = new Ksiazka("Ja","Wariacje",1000,true);
        Ksiazka ks2 = new Ksiazka("On","Obligacje w domu",500,true);
        Ksiazka ks3 = new Ksiazka("Ona","Kwitnące magnolie",700,true);
        Ksiazka ks4 = new Ksiazka("My","Ogien",100,true);
        Czytelnik cz1 = new Czytelnik("Filip", "Sarp",100);
        Czytelnik cz2 = new Czytelnik("John", "Doe",101);
        Biblioteka b1 = new Biblioteka(3);
        // błędny czytelnik Czytelnik cz1 = new Czytelnik("Filip", "Sk",0);
        b1.addBook(ks1);
        b1.addBook(ks2);
        b1.addBook(ks3);
        b1.printAvailableBooks();
        b1.countAvailableBooks();
        b1.borrowBook("Wariacje",cz1);
        b1.printAvailableBooks();
        b1.countAvailableBooks();
        b1.borrowBook("Wariacje",cz1);
        b1.returnBook("Wariacje",cz1);
        b1.countAvailableBooks();
        b1.printAvailableBooks();



    }
}
