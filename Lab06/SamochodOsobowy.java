package Lab06;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod{
    Scanner input = new Scanner(System.in);
    int Ilosc_osob;
    double Waga,Pojemnosc_silnika;

    public SamochodOsobowy() {
        System.out.print("Wprowadz ilosc osob samochodu: ");
        Ilosc_osob = input.nextInt();
        do {
            System.out.print("Wprowadz wage samochodu: ");
            Waga = input.nextDouble();
        }while(Waga<2 || Waga>4.5);
        do {
            System.out.print("Wprowadz pojemnosc silnika samochodu: ");
            Pojemnosc_silnika = input.nextDouble();
        }while(Pojemnosc_silnika<0.8 || Pojemnosc_silnika>3.0);
        super.Samochod_opis();
    }
}
