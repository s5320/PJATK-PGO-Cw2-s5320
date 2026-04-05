package minibliblioteka;

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        // logika dodawania do tablicy
    }

}
