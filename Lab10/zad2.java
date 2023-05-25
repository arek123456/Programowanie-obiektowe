package Lab10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Map<String,String> pary = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String imie1, imie2;
        while(true) {
            System.out.print("Podaj imie partnera: ");
            imie1 = input.nextLine();
            if (imie1.equals("-")) {
                break;
            }
            System.out.print("Podaj imie partnerki: ");
            imie2 = input.nextLine();
            if (imie2.equals("-")) {
                break;
            }
            pary.put(imie1, imie2);
        }
        System.out.print("Podaj imie partnera (sprawdzenie): ");
        imie1 = input.nextLine();
        System.out.println("Partnerka dla partnera" + imie1 + " to " + pary.get(imie1));
    }
}
