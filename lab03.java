package Lab03;

import java.util.Random;
import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        //srednia();
        //ilosc_liczb();
        //ciag();
        //algorytm();
        palindrom();

    }
    //zad.1
    public static void srednia(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe studentow: ");
        double studenci=input.nextDouble();
        double licznik = studenci;
        double suma = 0;
        while(licznik > 0){
            System.out.print("Punkty: ");
            double ocena=input.nextDouble();
            suma += ocena;
            licznik--;
        }
        double srednia=suma/studenci;
        System.out.format("Srednia: %f",srednia);
    }
    //zad.2
    public static void ilosc_liczb(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");
        int ujemna = 0;
        int dodatnia = 0;
        int sumowanie = 0;
        for(int i=0; i<10; i++){
            int b = input.nextInt();
            if(b>=0){
                dodatnia++;
            }
            else{
                ujemna++;
            }
            sumowanie += b;
        }
        System.out.format("Ilość dodatnich: %d\nIlość ujemnych: %d\nSuma: %d",dodatnia,ujemna,sumowanie);
    }
    //zad.3
    public static void ciag(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj dlugosc ciagu: ");
        int an = input.nextInt();
        System.out.println("Podaj liczby ciagu: ");
        int sumka=0;
        for(int i=0; i<an; i++){
            int a = input.nextInt();
            if(a%2==0){
                sumka += a;
            }
        }
        System.out.format("Suma liczb parzystych: %d",sumka);
    }
    //zad.4
    public static void algorytm(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Podaj dlugosc ciagu: ");
        int an=input.nextInt();
        int sumo=0;
        for(int i=0; i<an; i++){
            int c = rand.nextInt(-9,45);
            System.out.format("  %d",c);
            if(c%2==0){
                sumo += c;
            }
        }
        System.out.format("\nSuma liczb parzystych: %d",sumo);
    }
    //zad.5
    public static void palindrom(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj jedno slowo: ");
        String slowo = input.nextLine();
        int dlugosc = slowo.length();
        int koniec = 0;
        int dl = (dlugosc - 1);
        for (int i=0; i<dlugosc; i++) {
            if (slowo.charAt(i) != slowo.charAt(dl)) {
                koniec = 1;
                break;
            }
            dl--;
        }
        if (koniec == 1) {
            System.out.print("Podane slowo nie jest palindromem!");
        }
        else {
            System.out.print("Podane slowo jest palindromem!");
        }
    }
}
