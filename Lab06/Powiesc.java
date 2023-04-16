package Lab06;

public class Powiesc extends Ksiegarnia{
    String nazwa, autor, wydawnictwo;
    int rok_wydania;

    public Powiesc(String nazwa, String autor, String wydawnictwo, int rok_wydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rok_wydania = rok_wydania;
    }
}
