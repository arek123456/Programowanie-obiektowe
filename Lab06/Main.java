package Lab06;

public class Main {
    public static void main(String[] args) {
        //zad.1
        Punkt punkt = new Punkt(23.23,2.4);
        Punkt punkt1 = new Punkt(23.23,2.4);
        Punkt punkt2 = new Punkt(23.23,2.4);
        punkt.opis();
        punkt.przesun(-1,2);
        punkt.opis();
        Figura figura = new Figura();
        Prostokat prostokat = new Prostokat(2,3);
        Trojkat trojkat = new Trojkat(5,3);
        prostokat.przesun(3,5);
        Kwadrat kwadrat = new Kwadrat(4,4,"red");
        punkt.opis();
        figura.opis();
        kwadrat.opis();
        prostokat.opis();
        trojkat.opis();
    }
}
