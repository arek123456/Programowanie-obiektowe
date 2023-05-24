package Lab09;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        /*try {
            dzielenie(24, 5);
        } catch (dzielenieZeroException e) {
            System.out.println("Dzielenie przez zero: " + e.getMessage());
        }*/

        try {
            Dzielenie dz = new Dzielenie(23, 5);
        }catch (dzielenieZeroException e) {
            System.out.println("Nie jest dozwolone, " + e.getMessage());
        }

        try {
            Dzielenie dz2 = new Dzielenie(23, 0);
        }catch (dzielenieZeroException e) {
            System.out.println("Nie jest dozwolone, " + e.getMessage());
        }

        try {
            Dzielenie dz2 = new Dzielenie(0, 0);
        }catch (dzielenieZeroException e) {
            System.out.println("Nie jest dozwolone, " + e.getMessage());
        }
    }

}

class Dzielenie{
    private float a, b;

    public Dzielenie(float a, float b) throws dzielenieZeroException{
        String error = "";

        if(b == 0) error += "Nie dziel przez 0 ";
        if(!error.equals("")) throw new dzielenieZeroException(error);

        float wynik = a / b;
        System.out.println("Wynik: " + wynik);

        this.a = a;
        this.b = b;
    }
    /*public static void dzielenie(int a, int b) throws dzielenieZeroException{
        String error = " ";
        Scanner skan =  new Scanner(System.in);
        System.out.print("Podaj liczbe nr 1: ");
        float a = skan.nextFloat();
        System.out.print("Podaj liczbe nr 2: ");
        float b = skan.nextFloat();
        if(b == 0) throw new dzielenieZeroException(error);
        float wynik = a / b;
        System.out.print("Wynik dzielenia: " + wynik);

    }
    */

}

class dzielenieZeroException extends java.lang.Exception{
    public dzielenieZeroException(String message){
        super(message);
    }
}
