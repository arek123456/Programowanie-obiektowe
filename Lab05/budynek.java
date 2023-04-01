package Lab05;

import java.time.LocalDate;

public class budynek {
    public static void main(String[] args) {
        //zad.2
        info_budynek budynek1 = new info_budynek("Wiezowiec", 14, LocalDate.of(2002,5,11));
        info_budynek budynek2 = new info_budynek("Jednorodzinny", 2, LocalDate.of(2010,7,19));
        info_budynek budynek3 = new info_budynek("Wielorodzinny", 3, LocalDate.of(1985,9,15));
        info_budynek budynek4 = new info_budynek("Szeregowka", 2, LocalDate.of(1967,2,27));
        budynek1.wyp_bud();
        budynek2.wyp_bud();
        budynek3.wyp_bud();
        budynek4.wyp_bud();
    }
}
