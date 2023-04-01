package Lab05;

import java.time.LocalDate;

public class info_budynek {
    String nazwa_budynku;
    int liczba_pieter;
    LocalDate rok_budowy;
    public info_budynek(String nazwa_budynku, int liczba_pieter, LocalDate rok_budowy) {
        this.nazwa_budynku = nazwa_budynku;
        this.liczba_pieter = liczba_pieter;
        this.rok_budowy = rok_budowy;
    }
    public long rok_budowy() {
        LocalDate koniec = LocalDate.now();
        long wiek_budynku = java.time.temporal.ChronoUnit.YEARS.between(rok_budowy, koniec);
        return wiek_budynku;
    }
    public void wyp_bud() {
        System.out.println("Nazwa budynku: " + nazwa_budynku);
        System.out.println("Ilosc pieter w budynku: " + liczba_pieter);
        System.out.println("Wiek budynku: " + rok_budowy() + " lat\n");
    }
}
