package Lab09;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.toRadians;

public class zadanie6 {
    public static void main(String[] args) {
        kalkulator();
    }
    public static void kalkulator(){
        Scanner input = new Scanner(System.in);
        boolean wartosc = true;
        while(wartosc){
            System.out.println("\n1)Suma 2)Różnica 3)Iloczyn 4)Iloraz 5)Potęga 6)Pierwiastek 7)Trygonometria 8)Zamknij");
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
        int l1=input.nextInt();
        System.out.print("Podaj liczbe 2: ");
        int l2=input.nextInt();
        try {
            System.out.format("Iloraz: %d \n\n", l1 / l2);
        }catch (ArithmeticException e){
            System.err.println("Podaj druga liczbe rozna od 0!");
        }
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
        try {
            System.out.format("Pierwiastek: %f \n\n",Math.sqrt(l1));
        }catch (ArithmeticException e){
            System.err.println("Podaj liczbe wieksza badz rowna 0!");
        }
    }
    public static void funTryg(){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        double l1=input.nextDouble();
        System.out.format("Sinus: %f\nCosinus: %f\nTangens: %f\nCotangens: %f \n\n",Math.sin(toRadians(l1)),Math.cos(toRadians(l1)),Math.tan(toRadians(l1)),1/(Math.tan(toRadians(l1))));
    }
}
