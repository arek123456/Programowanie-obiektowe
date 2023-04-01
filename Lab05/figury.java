package Lab05;

import java.util.Scanner;

public class figury {
    public static void main(String[] args) {
        //zad.1
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.println("Wybierz numer figury:\n1. Kolo  2. Kula  3.Kwadrat  4.Prostokat  5. Prostopadloscian  6. Stozek  7. Szescian  8. Wyjscie");
            n = input.nextInt();
            switch(n){
                case 1:
                    System.out.println("Wpisz dlugosc promienia kola: ");
                    kolo kolo1 = new kolo(input.nextDouble());
                    kolo1.wyp_kola();
                    break;
                case 2:
                    System.out.println("Wpisz dlugosc promienia kuli: ");
                    kula kula1 = new kula(input.nextDouble());
                    kula1.wyp_kula();
                    break;
                case 3:
                    System.out.println("Wpisz dlugosc boku kwadratu: ");
                    kwadrat kwadrat1 = new kwadrat(input.nextDouble());
                    kwadrat1.wyp_kwadratu();
                    break;
                case 4:
                    System.out.println("Wpisz długosci bokow prostokata: ");
                    prostokat prostokat1 = new prostokat(input.nextDouble(), input.nextDouble());
                    prostokat1.wyp_prostokata();
                    break;
                case 5:
                    System.out.println("Wpisz dlugosci bokow prostopadloscianu: ");
                    prostopadloscian prostopadloscian1 = new prostopadloscian(input.nextDouble(), input.nextDouble(), input.nextDouble());
                    prostopadloscian1.wyp_prostopadloscianu();
                    break;
                case 6:
                    System.out.println("Podaj dlugosc promienia, tworzacej, wysokosci stozka: ");
                    stozek stozek1 = new stozek(input.nextDouble(), input.nextDouble(), input.nextDouble());
                    stozek1.wyp_stozka();
                    break;
                case 7:
                    System.out.println("Podaj długosc boku szescianu: ");
                    szescian szescian1 = new szescian(input.nextDouble());
                    szescian1.wyp_szescianu();
                    break;
                case 8:
                    break;
            }
        }
        while (n != 8);
    }
}
