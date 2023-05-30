package Lab10;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class zad4 {
    public static final String koniec = "-";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marka;
        List<String> samochody = new LinkedList<>();
    do{
        System.out.print("Podaj marke: ");
        marka = input.nextLine();
        if (!marka.equals(koniec)) {
            samochody.add(marka);
        }
    }while (!marka.equals(koniec));
        List<String> fragment = samochody.subList(1, 3);
        System.out.println("Lista fragment:");
        System.out.println(fragment);
        samochody.remove(1);
        samochody.remove(3);
        System.out.println("Lista samochody po usunieciu:");
        System.out.print(samochody);
    }
}
