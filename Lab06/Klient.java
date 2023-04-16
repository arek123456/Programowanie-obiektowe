package Lab06;

public class Klient extends Ksiegarnia{
    String imie, nazwisko;
    int id;

    public Klient(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }
    public Klient(String nazwa, String rodzaj){
        super(nazwa, rodzaj);
    }
}
