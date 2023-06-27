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

public class Autobus extends Pojazd{
    Scanner input = new Scanner(System.in);
    LinkedList<String> daneAutobus = new LinkedList<>();
    int maksOsob;
    double dlugosc;

    public Autobus(String marka, String model, String kolor, int rokProdukcji, int przebieg, int maksOsob, double dlugosc) {
        super(marka, model, kolor, rokProdukcji, przebieg);
        this.maksOsob = maksOsob;
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "maksOsob=" + maksOsob +
                ", dlugosc=" + dlugosc +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", przebieg=" + przebieg +
                '}';
    }

    public void odczyt(){
        super.wyswietlDane();
        System.out.println("Maksymalna liczba osób: "+maksOsob);
        System.out.println("Długość: "+dlugosc);
    }
    public void dodajDane() {
        String dane;
        System.out.println("Wprowadż dane w postaci[marka model kolor rokProdukcji przebieg maksOsob dlugosc]: ");
        while (true) {
            dane = input.nextLine();
            if(dane.equals("-")){
                break;
            }
            Pattern pattern = Pattern.compile("[a-zA-Z]+ [a-zA-Z0-9]+ [a-zA-z]+ [0-9]+ [0-9]+ [0-9]+ [0-9]+.[0-9]+");
            Matcher matcher = pattern.matcher(dane);
            if(matcher.matches()) {
                daneAutobus.add(dane);
            }
            else{
                System.out.println("Wprowadź prawidłowe dane według wzorca!");
                break;
            }
        }
        System.out.println("Wprowadzone dane: ");
        for (String i : daneAutobus) {
            System.out.println(i);
        }
    }
    public void usunDane(){
        int id;
        System.out.println("Podaj id, które chcesz usunąć: ");
        while (true) {
            id = input.nextInt();
            if(id >= daneAutobus.size() || id < 0){
                System.out.println("Podaj prawidłowe id!");
                break;
            }
            daneAutobus.remove(id);
            break;
        }
        System.out.println("Dane po usunięciu: ");
        for (String i : daneAutobus) {
            System.out.println(i);
        }
    }
    public void zapisdoPliku(){
        try {
            Files.write(Paths.get("bazaAutobus.txt"), daneAutobus);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Zapisano!");
    }
    public void odczytzPliku(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bazaAutobus.txt"))) {
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
