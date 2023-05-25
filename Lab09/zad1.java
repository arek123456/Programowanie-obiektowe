package Lab09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args){
        zad();
    }

    public static void zad(){
        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        double wartosc = 0;
        while (true){
            try{
                wartosc = input.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Podaj poprawna liczbe" );
                input.nextDouble();
            }
        }

        if(wartosc < 0)
            throw new IllegalArgumentException("Pierwiatek kwadratowy z liczby "+wartosc+" nie istnieje");
        System.out.print(String.format("Pierwiatek z %.4f = %.4f", wartosc, Math.sqrt(wartosc)));
    }
}
