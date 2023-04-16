package Lab06;

import java.util.Scanner;

public class Samochod {
    Scanner input = new Scanner(System.in);
    String Marka,Model,Nadwozie,Kolor;
    int Rok_produkcji, Przebieg;

    public Samochod() {
        System.out.print("\nWprowadz marke samochodu: ");
        Marka = input.nextLine();
        System.out.print("Wprowadz model samochodu: ");
        Model = input.nextLine();
        System.out.print("Wprowadz nadwozie samochodu: ");
        Nadwozie = input.nextLine();
        System.out.print("Wprowadz kolor samochodu: ");
        Kolor = input.nextLine();
        System.out.print("Wprowadz rok produkcji samochodu: ");
        Rok_produkcji = input.nextInt();
        System.out.print("Wprowadz przebieg samochodu: ");
        Przebieg = input.nextInt();
    }
    public void Samochod_opis(){
        System.out.println("\nMarka samochodu: "+Marka);
        System.out.println("Model samochodu: "+Model);
        System.out.println("Nadwozie samochodu: "+Nadwozie);
        System.out.println("Kolor samochodu: "+Kolor);
        System.out.println("Rok produkcji samochodu: "+Rok_produkcji);
        System.out.println("Przebieg samochodu: "+Przebieg);
    }
}
