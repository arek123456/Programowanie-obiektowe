package Lab09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie1 {
        public static void main(String[] args) {
            System.out.print("Podaj liczbe: ");
            Scanner input = new Scanner(System.in);
            double wartosc = 0;
            while (true) {
                try {
                    wartosc = input.nextDouble();
                    break;
                }
                catch (InputMismatchException e) {
                    System.out.println("Podaj poprawna liczbe!");
                    input.next();
                }
            }
            if (wartosc < 0) {
                throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.4f nie istnieje!", wartosc));
            }
            System.out.print(String.format("Pierwiastek z %.4f to %.4f.", wartosc, Math.sqrt(wartosc)));
        }
    }
