package Lab11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz sciezke do pliku: ");
        String sciezka = input.nextLine();
        System.out.println("Wprowadz dzien urodzenia: ");
        int dzienurodzenia = input.nextInt();
        System.out.println("Wprowadz miesiac urodzenia: ");
        int miesiacurodzenia = input.nextInt();
        System.out.println("Wprowadz rok urodzenia: ");
        int rokurodzenia = input.nextInt();
        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream(sciezka));
            output.writeInt(dzienurodzenia);
            output.writeInt(miesiacurodzenia);
            output.writeInt(rokurodzenia);
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
