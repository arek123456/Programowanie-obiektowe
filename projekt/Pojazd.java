package projekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pojazd {
    Scanner input = new Scanner(System.in);
    LinkedList<String> danePojazd = new LinkedList<>();
    String marka, model, kolor;
    int rokProdukcji, przebieg;

    public Pojazd(String marka, String model, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", przebieg=" + przebieg +
                '}';
    }

    public void dodajDane() {
        String dane;
        System.out.println("Wprowadż dane w postaci[marka model kolor rokProdukcji przebieg]: ");
        while (true) {
            dane = input.nextLine();
            if(dane.equals("-")){
                break;
            }
            Pattern pattern = Pattern.compile("[a-zA-Z]+ [a-zA-Z0-9]+ [a-zA-z]+ [0-9]+ [0-9]+");
            Matcher matcher = pattern.matcher(dane);
            if(matcher.matches()) {
                danePojazd.add(dane);
            }
            else{
                System.out.println("Wprowadź prawidłowe dane według wzorca!");
                break;
            }
        }
        System.out.println("Wprowadzone dane: ");
        for (String i : danePojazd) {
            System.out.println(i);
        }
    }
    public void usunDane(){
        int id;
        System.out.println("Podaj id, które chcesz usunąć: ");
        while (true) {
            id = input.nextInt();
            danePojazd.remove(id);
            break;
        }
        System.out.println("Dane po usunięciu: ");
        for (String i : danePojazd) {
            System.out.println(i);
        }
    }
    public void wyswietlDane() {
        System.out.println("Przechowywane dane: ");
        for (String i : danePojazd) {
            System.out.println(i);
        }
    }
    public void zapisdoPliku(){
        try {
            Files.write(Paths.get("bazaPojazd.txt"), danePojazd);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Zapisano!");
    }
    public void odczytzPliku(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bazaPojazd.txt"))) {
            StringBuffer textBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                textBuffer.append(line);
                textBuffer.append("\n");
            }
            System.out.println("Zawartość pliku: ");
            System.out.println(textBuffer);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
