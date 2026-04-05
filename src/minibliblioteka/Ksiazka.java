package minibliblioteka;

public class Ksiazka {
    private String autor;
    private String tytul;
    private int liczbaStron;
    private boolean dostepna;
    private int iloscWypozyczen;

    private int getIloscWypozyczen() {
        return iloscWypozyczen;
    }

    private void setIloscWypozyczen(int iloscWypozyczen) {
        this.iloscWypozyczen = iloscWypozyczen;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    private void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    private void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public boolean isDostepna() {
        return dostepna;
    }

    private void setDostepna(boolean dostepna) {
        this.dostepna = dostepna;
    }

    public Ksiazka(String autor, String tytul, int liczbaStron, boolean dostepna) {
        if (autor.isEmpty()){
            throw new IllegalArgumentException("Autor nie może być pusty");
        }else this.autor = autor;
        if (tytul.isEmpty()){
            throw new IllegalArgumentException("Tytuł nie może być pusty");
        }else this.tytul = tytul;
        if (liczbaStron <= 0) {
            throw new IllegalArgumentException("Książka musi zawierać strony");
        }else this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    void getInfo() {
        System.out.println("Autor: " + autor);
        System.out.println("Tytul: " + tytul);
        System.out.println("LiczbaStron: " + liczbaStron);
    }
    void borrowBook(){
        if (isDostepna()){
            System.out.println("Wypozyczam książkę: " + this.tytul);
            getInfo();
        } else System.out.println("Książka niedostępna");

        setDostepna(false);
        this.iloscWypozyczen++; //Dodatkowe
    }
    void returnBook(){
        if (isDostepna()){
            System.out.println("Nie można zwrócić dostępnej książki");
        }else System.out.println("Książka "+tytul+" została zwrócona");
        setDostepna(true);
    }

}
