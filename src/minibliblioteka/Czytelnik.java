package minibliblioteka;

import java.util.ArrayList;

public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int nrKarty;
    private int liczbaWypozyczen;

    public String getImie() {
        return imie;
    }

    private void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    private void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNrKarty() {
        return nrKarty;
    }

    private void setNrKarty(int nrKarty) {
        this.nrKarty = nrKarty;
    }

    private int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    private void setLiczbaWypozyczen(int liczbaWypozyczen) {
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public Czytelnik(String imie, String nazwisko, int nrKarty) {
        if (imie.isEmpty()){
            throw new IllegalArgumentException("Imię nie może być puste");
        }else this.imie = imie;
        if (nazwisko.isEmpty()){
            throw new IllegalArgumentException("Nazwisko nie może być puste");
        }else this.nazwisko = nazwisko;
        if (nrKarty <= 0){
            throw new IllegalArgumentException("Numer karty musi być większy od 0");
        } else this.nrKarty = nrKarty;
        if (liczbaWypozyczen < 0){
            throw new IllegalArgumentException("Liczba wypożyczeń nie może być mniejsza od 0")
        } this.liczbaWypozyczen = 0;
    }
    void printData(){
        System.out.println("Imie: " + this.imie + " Nazwisko: " + this.nazwisko +
                " Numer Karty: " + this.nrKarty + " Liczba wypożyczeń" + this.liczbaWypozyczen);
    }
}
