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
        System.out.println("\n1)Suma 2)Różnica 3)Iloczyn 4)Iloraz 5)Potęga 6)Pierwiastek 7)Trygonometria 8)Tablica(poczatek) 9)Tablica(koniec) 10)Tablica(parzyste) \n11)Tablica(nieparzyste) 12)Tablica(suma) 13)Tablica(iloczyn) 14)Tablica(srednia) 15)Tablica(min) 16)Tablica(max) 17)Zamknij");
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
            case 8->wyswietleniea();
            case 9->wyswietlenieb();
            case 10->wyswietleniec();
            case 11->wyswietlenied();
            case 12->wyswietleniee();
            case 13->wyswietlenief();
            case 14->wyswietlenieg();
            case 15->wyswietlenieh();
            case 16->wyswietleniei();
            case 17->wartosc=false;
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
    //zad.3 a)
    public static void wyswietleniea(){
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        System.out.print("Elementy tablicy (od poczatku): ");
        for(int i=0; i<tablica.length; i++){
            System.out.format("%d ",tablica[i]);
        }
    }
    //zad.3 b)
    public static void wyswietlenieb(){
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        System.out.print("Elementy tablicy (od konca): ");
        for(int i=tablica.length-1; i>=0; i--){
            System.out.format("%d ",tablica[i]);
        }
    }
    //zad.3 c)
    public static void wyswietleniec() {
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = input.nextInt();
        }
        System.out.print("Elementy tablicy (parzyste indeksy): ");
        for (int i = 0; i < tablica.length; i++) {
            if (i % 2 == 0) {
                System.out.format("%d ", tablica[i]);
            }
        }
    }
    //zad.3 d)
    public static void wyswietlenied() {
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = input.nextInt();
        }
        System.out.print("Elementy tablicy (parzyste indeksy): ");
        for (int i = 0; i < tablica.length; i++) {
            if (i % 2 != 0) {
                System.out.format("%d ", tablica[i]);
            }
        }
    }
    //zad.4 e)
    public static void wyswietleniee(){
        Scanner input = new Scanner(System.in);
        int suma=0;
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        for(int i=0; i<tablica.length; i++){
            suma+=tablica[i];
        }
        System.out.format("Suma elementow tablicy: %d",suma);
    }
    //zad.4 f)
    public static void wyswietlenief(){
        Scanner input = new Scanner(System.in);
        int iloczyn=1;
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        for(int i=0; i<tablica.length; i++){
            iloczyn*=tablica[i];
        }
        System.out.format("Iloczyn elementow tablicy: %d",iloczyn);
    }
    //zad.4 g)
    public static void wyswietlenieg(){
        Scanner input = new Scanner(System.in);
        double srednia=0;
        double suma=0;
        double ilosc=0;
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        for(int i=0; i<tablica.length; i++){
            suma+=tablica[i];
            ilosc++;
        }
        srednia=suma/ilosc;
        System.out.format("Srednia elementow tablicy: %f",srednia);
    }
    //zad.4 h)
    public static void wyswietlenieh(){
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        int min=tablica[0];
        for(int i=0; i<tablica.length; i++){
            if(min>tablica[i]){
                min=tablica[i];
            }
        }
        System.out.format("Minimum elementow tablicy: %d",min);
    }
    //zad.4 i)
    public static void wyswietleniei(){
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[10];
        System.out.println("Wprowadz 10 liczb do tablicy: ");
        for(int i=0; i<tablica.length; i++){
            tablica[i] = input.nextInt();
        }
        int max=tablica[0];
        for(int i=0; i<tablica.length; i++){
            if(max<tablica[i]){
                max=tablica[i];
            }
        }
        System.out.format("Maksimum elementow tablicy: %d",max);
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


