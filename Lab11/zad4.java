package Lab11;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj sciezke do pliku: ");
        String sciezka = input.nextLine();
        DataInputStream inputFile = null;
        int dzienurodzenia = 0;
        int miesiacurodzenia = 0;
        int rokurodzenia = 0;
        try {
            inputFile = new DataInputStream(new FileInputStream(sciezka));
            dzienurodzenia = inputFile.readInt();
            miesiacurodzenia = inputFile.readInt();
            rokurodzenia = inputFile.readInt();
        } finally {
            if (inputFile != null) {
                inputFile.close();
            }
        }
        System.out.println("Twoja data urodzenia to: " +dzienurodzenia+ "." +miesiacurodzenia+ "." +rokurodzenia+ " r.");
    }
}
