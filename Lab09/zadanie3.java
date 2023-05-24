package Lab09;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        int[] tab = {1, 3, 7, 11, 17,23,48,67};
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz numer elementu w tablicy,ktory mam wyswietlic: ");
        int numer = input.nextInt();
        try {
            System.out.println(tab[numer]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś numer, ktory wykracza poza rozmiar tablicy!");
        }
    }
}
