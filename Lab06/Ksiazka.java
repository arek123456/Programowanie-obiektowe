package Lab06;

public class Ksiazka extends Ksiegarnia{
    String nazwa, autor, wydawnictwo;
    int rok_wydania;

    public Ksiazka(String nazwa, String autor, String wydawnictwo, int rok_wydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rok_wydania = rok_wydania;
    }
}
