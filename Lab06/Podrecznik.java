package Lab06;

import java.util.Scanner;

public class Podrecznik extends Ksiegarnia{
    Scanner input = new Scanner(System.in);
    String nazwa, autor, wydawnictwo, oprawka;
    int rok_wydania;

    public Podrecznik(String nazwa, String autor, String wydawnictwo, int rok_wydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rok_wydania = rok_wydania;
    }
    public Podrecznik(String nazwa, String autor, String wydawnictwo, int rok_wydania, String oprawka) {
        this(nazwa, autor, wydawnictwo, rok_wydania);
        this.oprawka = oprawka;
    }
}
