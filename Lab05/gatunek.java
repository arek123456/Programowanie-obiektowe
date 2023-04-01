package Lab05;

public class gatunek {
    String rodzaj;
    String gatunek1;
    int liczba2n;
    int x;
    String opis;
    public String pelna_nazwa() {
        return rodzaj + " " + gatunek1;
    }
    public int haploidalna_liczba_chromosomow() {
        return liczba2n/2;
    }
    public void wyp_dane() {
        System.out.println("Rodzaj: " + rodzaj);
        System.out.println("\nNazwa gatunkowa: " + gatunek1);
        System.out.println("2n: " + liczba2n);
        System.out.println("x: " + x);
        System.out.println("n: " + haploidalna_liczba_chromosomow());
        System.out.println("Opis: " + opis);
    }
    public gatunek klonowanie() {
        gatunek klon = new gatunek();
        klon.rodzaj = rodzaj;
        klon.gatunek1 = gatunek1;
        klon.liczba2n = liczba2n;
        klon.x = x;
        klon.opis = opis;
        return klon;
    }
}
