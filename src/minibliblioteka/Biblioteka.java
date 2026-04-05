package minibliblioteka;

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek=0;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
    }

    void addBook(Ksiazka ksiazka) {
        if (ksiazka == null) {
            throw new IllegalArgumentException("Książka nie może być niczym");
        }
        if (liczbaKsiazek >= this.ksiazki.length) {
            throw new IllegalStateException("Biblioteka nie pomieści więcej książek");
        }
        this.ksiazki[this.liczbaKsiazek++] = ksiazka;
    }
    void printAvailableBooks(){
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            if(this.ksiazki[i].isDostepna()==true) {
                System.out.println("############################");
                this.ksiazki[i].getInfo();
            }
        }
        System.out.println("############################");
    }
    Ksiazka findBookByTitle(String title) {
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            if (this.ksiazki[i].getTytul().equals(title)) {
                return this.ksiazki[i];
            }
        }
        return null;
    }
    void countAvailableBooks() {
        int j=0;
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            if (this.ksiazki[i].isDostepna() == true) {
                j++;
            }
        }
        System.out.println("Liczba dostępnych książek - " + j);
    }
    void borrowBook(String title, Czytelnik czytelnik){
        Ksiazka ksiazka = findBookByTitle(title);
                if (ksiazka.isDostepna()==true) {
                    czytelnik.addBook(ksiazka);
                    czytelnik.incBookRental();
                    ksiazka.borrowBook();
                    System.out.println("Książka wypożyczona przez " + czytelnik.getImie() + " " + czytelnik.getNazwisko());
                }else {
                    System.out.println("Książka niedostępna - przykro mi");
                }
            }

    void returnBook(String title, Czytelnik czytelnik){
        Ksiazka ksiazka = findBookByTitle(title);
        if (ksiazka.isDostepna()==false) {
            czytelnik.removeBook(ksiazka);
            czytelnik.decBookRental();
            ksiazka.returnBook();
            System.out.println("Książka zostałą zwrócona przez " + czytelnik.getImie() + " " + czytelnik.getNazwisko());
        }else {
            System.out.println("Książka jest na stanie nie może zostać zwrócona");
        }
    }
}
