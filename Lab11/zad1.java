package Lab11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String linia;
        System.out.println("Podaj sciezke do pliku: ");
        try {
            output = new FileWriter(input.nextLine());
            System.out.println("Podaj zawartosc do pliku: ");
            while (true) {
                linia = input.nextLine();
                if (linia.equals("-")) {
                    break;
                }
                output.write(linia);
                output.write(System.lineSeparator());
            }
        }
        finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
