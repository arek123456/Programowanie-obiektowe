package Lab04;

import java.util.Random;
import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        //sum_sred(40);
        //wypisywanie();
        //string();
        //wypisz();
        //sortowanie();
        //silnia();
        identyczne();
    }
    //zad.1
    public static void sum_sred(int rozmiar_tab) {
        Random rand = new Random();
        double suma = 0;
        int[] tab = new int[rozmiar_tab];
        for (int i = 0; i < rozmiar_tab; i++) {
            int losowanie = rand.nextInt(40);
            tab[i] = losowanie;
            System.out.format("%d ",tab[i]);
            suma += tab[i];
        }
        System.out.format("\nSuma: %f \nSrednia: %f",suma,suma/rozmiar_tab);
    }
    //zad.2
    public static void wypisywanie() {
        int[]tab1 = new int[]{1,2,5,8,10,12,13,20};
        int[]tab2 = new int[]{3,7,1,4,5,9,2};
        System.out.format("Tablica1: ");
        for (int i = 0; i < tab1.length; i+=2) {
            System.out.format("%d ",tab1[i]);
        }
        System.out.format("\nTablica2: ");
        for (int i = 0; i < tab2.length; i+=2) {
            System.out.format("%d ",tab2[i]);
        }
    }
    //zad.3
    public static void string() {
        String[] wyrazy = new String[]{"Ala ","ma ","kota"};
        for (String i:wyrazy) {
            System.out.print(i.toUpperCase());
        }
    }
    //zad.4
    public static void wypisz() {
        Scanner input = new Scanner(System.in);
        String[] wyrazy1 = new String[5];
        System.out.println("Podaj 5 wyrazow: ");
        for (int i = 0; i < 5; i++) {
            wyrazy1[i] = input.nextLine();
        }
        for (int i = 5-1; i > 0-1; i--) {
            System.out.format("%s ",odwracanie(wyrazy1[i]));
        }
    }
    private static String odwracanie(String wyrazy1) {
        String wyrazy_odwroc="";
        char[] znaki = wyrazy1.toCharArray();
        for (int i = znaki.length-1; i > -1; i--) {
            wyrazy_odwroc += znaki[i];
        }
        return wyrazy_odwroc;
    }
    //zad.5
    public static void sortowanie() {
        Scanner input = new Scanner(System.in);
        int[] tablica = new int[8];
        System.out.println("Podaj 8 liczb: ");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = input.nextInt();
        }
        for (int j = 0; j < tablica.length; j++) {
            for (int i = 0; i < 7; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    int sort1 = tablica[i];
                    int sort2 = tablica[i + 1];
                    tablica[i] = sort2;
                    tablica[i + 1] = sort1;
                }
            }
        }
        System.out.print("Posortowana tablica: ");
        for (int i:tablica) {
            System.out.print(i+" ");
        }
    }
    //zad.6
    public static void silnia() {
        Scanner input = new Scanner(System.in);
        int[] tabl = new int[5];
        System.out.println("Podaj 5 liczb: ");
        for (int i = 0; i < tabl.length; i++) {
            tabl[i] = input.nextInt();
        }
        for (int i = 0; i < tabl.length; i++) {
            System.out.format("Silnia(%d): %d\n",tabl[i],sil(tabl[i]));
        }
    }
        public static int sil(int a) {
            int silnia = 1;
            for (int i = 1; i < a + 1; i++) {
                silnia = i * silnia;
            }
            return silnia;
        }
    //zad.7
    public static void identyczne() {
        Scanner input = new Scanner(System.in);
        String[] tab1 = new String[]{"ala","ma","kota","i","psa"};
        String[] tab2 = new String[]{"ala","ma","kota","i","psa"};
        int licznik = 0;
        for (int i = 0; i < 5; i++) {
            if(tab1[i].equals(tab2[i])) {
                licznik++;
            }
        }
        if(licznik == 5) {
            System.out.print("Sa takie same");
        }
        else {
            System.out.print("Nie sa takie same");
        }
    }
}
