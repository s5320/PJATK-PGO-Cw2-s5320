package minibliblioteka;

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
        liczbaWypozyczen = 0;
    }
    void printData(){
        System.out.println("Imie: " + this.imie + " Nazwisko: " + this.nazwisko +
                " Numer Karty: " + this.nrKarty + " Liczba wypożyczeń - " + this.liczbaWypozyczen);
    }
    void incBookRental(){
        this.liczbaWypozyczen++;
        System.out.println("Liczba wypożyczeń zwięszona = " + this.liczbaWypozyczen);
    }
    void decBookRental() {
        this.liczbaWypozyczen--;
        if (this.liczbaWypozyczen < 0) {
            throw new IllegalStateException("Liczba wypożyczeń nie może być mniejsza od zera");
        }
        System.out.println("Liczba wypożyczeń zmniejszona = " + this.liczbaWypozyczen);
    }
}
