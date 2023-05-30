package Lab10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zad1 {
    public static final String koniec = "-";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String imie;
        Set<String> imiona = new HashSet<>();
        do{
            System.out.print("Podaj imie: ");
            imie = input.nextLine();
            if (!imie.equals(koniec)) {
                imiona.add(imie);
            }
        }while (!imie.equals(koniec));
        System.out.println("Podales "+imiona.size()+" unikalnych imion");
    }
}
