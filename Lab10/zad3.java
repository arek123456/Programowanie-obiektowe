package Lab10;

import java.util.*;

public class zad3 {
    int ID, wiek;
    String imie;

    public zad3(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "ID=" + ID +
                ", wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        zad3 zad3 = (zad3) o;
        return ID == zad3.ID && wiek == zad3.wiek && Objects.equals(imie, zad3.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> uczestnicy1 = new LinkedList<>();
        for(int i=0;i<5;i++) {
            System.out.print("Podaj imie uczestnika");
            String imie = input.nextLine();
            uczestnicy1.add(imie);
        }
        List<String> uczestnicy2 = new ArrayList<>();
    }
    public void niepelnoletni(){
        if(wiek<18){

        }
    }
}
