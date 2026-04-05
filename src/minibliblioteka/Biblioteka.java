package minibliblioteka;

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek=0;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
    }

    public void addBook(Ksiazka ksiazka) {
        // logika dodawania do tablicy
        if (ksiazka == null) {
            throw new IllegalArgumentException("Książka nie może być niczym");
        }
        if (liczbaKsiazek >= this.ksiazki.length) {
            throw new IllegalStateException("Biblioteka nie pomieści więcej książek");
        }
        this.ksiazki[this.liczbaKsiazek++] = ksiazka;
    }
    public void printAvailableBooks(){
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            System.out.println("############################");
            this.ksiazki[i].getInfo();
        }
    }
    public void findBookByTitle(String title){
        for (int i = 0; i < this.liczbaKsiazek; i++) {
            if(this.ksiazki[i].getTytul().equals(title)){
                this.ksiazki[i].getInfo();
            }
        }
    }
}
