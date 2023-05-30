package Lab11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader inputFile = null;
        int numerlinii = 0;
        String linia;

        System.out.println("Podaj sciezke do pliku: ");
        try {
            inputFile = new BufferedReader(new FileReader(input.next()));
            System.out.println("Zawartosc podanego pliku to: ");

            while (true) {
                linia = inputFile.readLine();
                if (linia == null) {
                    break;
                }
                numerlinii++;
                System.out.println(linia);
            }
        }
        finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }
        System.out.println("Plik posiada "+numerlinii+" linii.");
    }
}
