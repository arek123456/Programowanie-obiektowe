package projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IllegalArgumentException{
        Scanner input = new Scanner(System.in);
        //Przykładowe dane
        Samochod samochod = new Samochod("audi","a4","czerwony",2003,127000,"kombi",5);
        Motocykl motocykl = new Motocykl("honda","hornet","niebieski",2005,12500,"sport",5.5);
        Ciezarowy ciezarowy = new Ciezarowy("scania","t15","czarny",2016,450000,15.7,16.5);
        Autobus autobus = new Autobus("scania","t60","niebieski",2004,340000,50,14.5);
        Ciagnik ciagnik = new Ciagnik("ursus","c330","żółty",1985,5023,4);
        //MENU
        boolean wartosc = true;
        while(wartosc) {
            Thread.sleep(2000);
            System.out.println("                                    MENU POJAZDÓW\n" +
                    "1)Dodaj samochód 2)Usuń samochód 3)Wyświetl samochód 4)Zapisz samochód 5)Odczyt samochód\n" +
                    "6)Dodaj motocykl 7)Usuń motocykl 8)Wyświetl motocykl 9)Zapisz motocykl 10)Odczyt motocykl\n" +
                    "11)Dodaj ciężarowy 12)Usuń ciężarowy 13)Wyświetl ciężarowy 14)Zapisz ciężarowy 15)Odczyt ciężarowy\n" +
                    "16)Dodaj autobus 17)Usuń autobus 18)Wyświetl autobus 19)Zapisz autobus 20)Odczyt autobus\n" +
                    "21)Dodaj ciągnik 22)Usuń ciągnik 23)Wyświetl ciągnik 24)Zapisz ciągnik 25)Odczyt ciągnik " +
                    "\n26)Zamknij");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.print("Wybór: ");
            int wybor = input.nextInt();
                switch (wybor) {
                    case 1 -> samochod.dodajDane();
                    case 2 -> samochod.usunDane();
                    case 3 -> samochod.wyswietlDane();
                    case 4 -> samochod.zapisdoPliku();
                    case 5 -> samochod.odczytzPliku();
                    case 6 -> motocykl.dodajDane();
                    case 7 -> motocykl.usunDane();
                    case 8 -> motocykl.wyswietlDane();
                    case 9 -> motocykl.zapisdoPliku();
                    case 10 -> motocykl.odczytzPliku();
                    case 11 -> ciezarowy.dodajDane();
                    case 12 -> ciezarowy.usunDane();
                    case 13 -> ciezarowy.wyswietlDane();
                    case 14 -> ciezarowy.zapisdoPliku();
                    case 15 -> ciezarowy.odczytzPliku();
                    case 16 -> autobus.dodajDane();
                    case 17 -> autobus.usunDane();
                    case 18 -> autobus.wyswietlDane();
                    case 19 -> autobus.zapisdoPliku();
                    case 20 -> autobus.odczytzPliku();
                    case 21 -> ciagnik.dodajDane();
                    case 22 -> ciagnik.usunDane();
                    case 23 -> ciagnik.wyswietlDane();
                    case 24 -> ciagnik.zapisdoPliku();
                    case 25 -> ciagnik.odczytzPliku();
                    case 26 -> wartosc = false;
                }
        }
    }
}