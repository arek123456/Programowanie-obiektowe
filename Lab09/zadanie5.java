package Lab09;

import java.util.Random;

public class zadanie5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int licznik = 0;
        while(licznik != 3) {
            int liczba1 = -10 + rand.nextInt((10 - -10) + 1);
            int liczba2 = -10 + rand.nextInt((10 - -10) + 1);
            if(liczba2 == 0) {
                licznik++;
                System.out.println("Nie dziel przez zero!");
            } else {
                double iloraz = liczba1/liczba2;
                System.out.println("Wynik: " + iloraz);
            }
        }
        if(licznik == 3) {
            System.out.println("3 wystapienia");
            throw new ArithmeticException();
        }
    }
}
