package Lab05;

public class zwierzeta {
    public static void main(String[] args) {
        //zad.3
        gatunek pies = new gatunek();
        pies.rodzaj = "wilk";
        pies.gatunek1 = "pies domowy";
        pies.liczba2n = 78;
        pies.x = 37;
        pies.opis = "udomowiony gatunek ssaka drapieżnego z rodziny psowatych.";
        gatunek kot = new gatunek();
        kot.rodzaj = "kot";
        kot.gatunek1 = "kot domowy";
        kot.liczba2n = 38;
        kot.x = 19;
        kot.opis = "rodzaj drapieżnego ssaka z podrodziny kotów (Felinae) w rodzinie kotowatych (Felidae).";
        gatunek drugi_pies = pies.klonowanie();
        drugi_pies.opis = "Sklonowany pies";
        System.out.println(pies.pelna_nazwa());
        System.out.println("Opis: " + pies.opis);
        System.out.println(drugi_pies.pelna_nazwa());
        System.out.println("Opis: " + drugi_pies.opis);
        System.out.println("\n" + kot.pelna_nazwa());
        kot.wyp_dane();
    }
}
