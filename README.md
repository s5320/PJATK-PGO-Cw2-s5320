# Mini Biblioteka

Projekt zaliczeniowy z przedmiotu **PGO (Programowanie Generyczne i Obiektowe)**  
PJATK — Ćwiczenia 2

---

## Opis projektu

Aplikacja konsolowa symulująca system zarządzania biblioteką. 

---

## Struktura projektu

```
src/
└── minibliblioteka/
    ├── Biblioteka.java     # Główna klasa zarządzająca zasobami
    ├── Ksiazka.java        # Model książki
    ├── Czytelnik.java      # Model czytelnika
    └── Main.java           # Punkt wejścia aplikacji
```

---

## Klasy

### Ksiazka

Reprezentuje książkę w bibliotece.

| Pole | Typ | Opis |
|------|-----|------|
| `tytul` | `String` | Tytuł książki |
| `autor` | `String` | Autor książki |
| `dostepna` | `boolean` | Czy książka jest dostępna do wypożyczenia |

### Czytelnik

Reprezentuje czytelnika korzystającego z biblioteki.

| Pole | Typ | Opis |
|------|-----|------|
| `id` | `int` | Unikalny identyfikator (auto-increment) |
| `imie` | `String` | Imię czytelnika |
| `liczbaWypozyczen` | `int` | Liczba aktualnych wypożyczeń |

### Biblioteka

Główna klasa zarządzająca kolekcją książek i czytelników.

| Metoda | Opis |
|--------|------|
| `addBook(Ksiazka)` | Dodaje książkę do biblioteki |
| `borrowBook(String, Czytelnik)` | Wypożycza książkę czytelnikowi |
| `returnBook(String, Czytelnik)` | Zwraca książkę do biblioteki |
| `findBookByTitle(String)` | Wyszukuje książkę po tytule |
| `printAvailableBooks()` | Wypisuje dostępne książki |

---

## Uruchomienie

Wymagania: Java 17+

```bash
javac src/minibliblioteka/*.java
java -cp src minibliblioteka.Main
```

---

## Autor

s5320 — Polsko-Japońska Akademia Technik Komputerowych
