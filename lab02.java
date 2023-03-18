package Lab02;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.toRadians;

public class lab02 {
    public static void main(String[] args) {
        //rownanie();
        //wylaczenie();
        //nieskonczonosc();
        //sortowanie();
        kalkulator();
    }

    //zad.1
    public static void rownanie() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj a: ");
        double a = input.nextDouble();
        System.out.print("Podaj b: ");
        double b = input.nextDouble();
        System.out.print("Podaj c: ");
        double c = input.nextDouble();
        if (a == 0) {
            System.out.println("To nie jest rownanie kwadratowe");
        } else {
            double delta = (b * b) - (4 * a * c);
            System.out.println("Delta wynosi: " + delta);
            if (delta < 0) System.out.print("Brak rozwiazan");
            else if (delta == 0) System.out.format("Jedno rozwiazanie: x0=%.2f", (-b) / (2 * a));
            else if (delta > 0)
                System.out.format("Dwa rozwiazania: x1=%.2f , x2=%.2f", ((-b) - Math.sqrt(delta)) / (2 * a), ((-b) + Math.sqrt(delta)) / (2 * a));
        }
    }

    //zad.2
    public static void kalkulator(){
        Scanner input = new Scanner(System.in);
        boolean wartosc = true;
        while(wartosc){
        System.out.println("1)Suma 2)Różnica 3)Iloczyn 4)Iloraz 5)Potęga 6)Pierwiastek 7)Trygonometria 8)Zamknij");
        System.out.print("Wybor: ");
        int wybor = input.nextInt();
        switch(wybor){
            case 1->suma();
            case 2->roznica();
            case 3->iloczyn();
            case 4->iloraz();
            case 5->potega();
            case 6->pierwiastek();
            case 7->funTryg();
            case 8->wartosc=false;
        }
    }
}
    public static void suma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe 1: ");
        double l1=input.nextDouble();
        System.out.print("Podaj liczbe 2: ");
        double l2=input.nextDouble();
        System.out.format("Suma: %f \n\n",l1+l2);
    }
    public static void roznica(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe 1: ");
        double l1=input.nextDouble();
        System.out.print("Podaj liczbe 2: ");
        double l2=input.nextDouble();
        System.out.format("Roznica: %f \n\n",l1-l2);
    }
    public static void iloczyn(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe 1: ");
        double l1=input.nextDouble();
        System.out.print("Podaj liczbe 2: ");
        double l2=input.nextDouble();
        System.out.format("Iloczyn: %f \n\n",l1*l2);
    }
    public static void iloraz(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe 1: ");
        double l1=input.nextDouble();
        System.out.print("Podaj liczbe 2: ");
        double l2=input.nextDouble();
        System.out.format("Iloraz: %f \n\n",l1/l2);
    }
    public static void potega(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj podstawę: ");
        double l1=input.nextDouble();
        System.out.print("Podaj wykladnik: ");
        double l2=input.nextDouble();
        System.out.format("Potega: %f \n\n",Math.pow(l1,l2));
    }
    public static void pierwiastek(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double l1=input.nextDouble();
        System.out.format("Pierwiastek: %f \n\n",Math.sqrt(l1));
    }
    public static void funTryg(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double l1=input.nextDouble();
        System.out.format("Sinus: %f\nCosinus: %f\nTangens: %f\nCotangens: %f \n\n",Math.sin(toRadians(l1)),Math.cos(toRadians(l1)),Math.tan(toRadians(l1)),1/(Math.tan(toRadians(l1))));
    }
    //zad.5
    public static void wylaczenie() {
        int i = 0;
        for (i = 20; i >= 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.format("%d ", i);
        }
    }

    //zad.6
    public static void nieskonczonosc() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbe calkowita: ");
            int liczba = input.nextInt();
            if (liczba < 0)
                break;
        }
        System.out.print("Koniec petli!");
    }

    //zad.7
    public static void sortowanie() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ile chcesz wprowadzic liczb? ");
        int ilosc = input.nextInt();
        int[] tablica = new int[ilosc];
        System.out.println("Podaj liczby: ");
        for(int i=0; i<ilosc; i++) {
            tablica[i] = input.nextInt();
        }
        System.out.println("Przed posortowaniem  " + Arrays.toString(tablica));
            for (int i = 0; i < tablica.length; i++) {
                for (int j = i + 1; j < tablica.length; j++) {
                    int liczbaA = tablica[i];
                    int liczbaB = tablica[j];
                    if (liczbaA > liczbaB) {
                        tablica[i] = liczbaB;
                        tablica[j] = liczbaA;
                    }
                }
            }
            System.out.println("Tablica posortowana " + Arrays.toString(tablica));
        }
    }


