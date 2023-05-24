package Lab09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args){
        zad();
    }

    public static void zad(){
        System.out.println("Podaj liczbe: ");
        Scanner skan = new Scanner(System.in);
        double userInput = 0;
        while (true){
            try{
                userInput = skan.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Podaj poprawna liczbe" );
                skan.next();
            }
        }

        if(userInput < 0)
            throw new IllegalArgumentException(String.format("Pierwiatek kwadratowy z liczby %.4f nie istnieje", userInput));
        System.out.print(String.format("Pierwiatek z %.4f = %.4f", userInput, Math.sqrt(userInput)));
    }
}
