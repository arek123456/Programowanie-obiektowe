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

public class Motocykl extends Pojazd{
    Scanner input = new Scanner(System.in);
    LinkedList<String> daneMotocykl = new LinkedList<>();
    String rodzajMoto;
    double spalanie;

    public Motocykl(String marka, String model, String kolor, int rokProdukcji, int przebieg, String rodzajMoto, double spalanie) {
        super(marka, model, kolor, rokProdukcji, przebieg);
        this.rodzajMoto = rodzajMoto;
        this.spalanie = spalanie;
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "rodzajMoto='" + rodzajMoto + '\'' +
                ", spalanie=" + spalanie +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", przebieg=" + przebieg +
                '}';
    }

    public void odczyt(){
        super.wyswietlDane();
        System.out.println("Rodzaj: "+rodzajMoto);
        System.out.println("Spalanie: "+spalanie);
    }

    public void dodajDane() {
        String dane;
        System.out.println("Wprowadż dane w postaci[marka model kolor rokProdukcji przebieg rodzajMoto spalanie]: ");
        while (true) {
            dane = input.nextLine();
            if(dane.equals("-")){
                break;
            }
            Pattern pattern = Pattern.compile("[a-zA-Z]+ [a-zA-Z0-9]+ [a-zA-z]+ [0-9]+ [0-9]+ [a-zA-z]+ [0-9]+.[0-9]+");
            Matcher matcher = pattern.matcher(dane);
            if(matcher.matches()) {
                daneMotocykl.add(dane);
            }
            else{
                System.out.println("Wprowadź prawidłowe dane według wzorca!");
                break;
            }
        }
        System.out.println("Wprowadzone dane: ");
        for (String i : daneMotocykl) {
            System.out.println(i);
        }
    }
    public void usunDane(){
        int id;
        System.out.println("Podaj id, które chcesz usunąć: ");
        while (true) {
            id = input.nextInt();
            if(id >= daneMotocykl.size() || id < 0){
                System.out.println("Podaj prawidłowe id!");
                break;
            }
            daneMotocykl.remove(id);
            break;
        }
        System.out.println("Dane po usunięciu: ");
        for (String i : daneMotocykl) {
            System.out.println(i);
        }
    }
    public void wyswietlDane(){
        super.wyswietlDane();
        System.out.println("Rodzaj: "+rodzajMoto);
        System.out.println("Spalanie: "+spalanie);
    }
    public void zapisdoPliku(){
        try {
            Files.write(Paths.get("bazaMotocykl.txt"), daneMotocykl);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Zapisano!");
    }
    public void odczytzPliku(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("bazaMotocykl.txt"))) {
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
