package Lab01;

import java.util.Random;
import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        System.out.println(Imie());
        System.out.println(Wiek());
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj liczbe a: ");
        float a=input.nextFloat();
        System.out.println("Podaj liczbe b: ");
        float b=input.nextFloat();
        Dzialania(a,b);
        System.out.println(czyParzysta(4));
        System.out.println(czyPodzielna(15));
        Potega(2);
        Pierwiastek(4);
        System.out.println("Podaj liczbe k: ");
        int k=input.nextInt();
        System.out.println("Podaj liczbe l: ");
        int l=input.nextInt();
        Random rand=new Random();
        int g=rand.nextInt(l-k+1)+k;
        int h=rand.nextInt(l-k+1)+k;
        int i=rand.nextInt(l-k+1)+k;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(czyTrojkat(g,h,i));
    }
    //zad.1
    public static String Imie(){
        return "Arkadiusz";
    }
    public static int Wiek(){
        return 20;
    }
    //zad.2
    public static void Dzialania(float a, float b) {
        System.out.println("Suma: " +a+ "+" +b+ "=" +(a+b));
        System.out.println("Roznica: " +a+ "-" +b+ "=" +(a-b));
        System.out.println("Iloczyn: " +a+ "*" +b+ "=" +(a*b));
    }
    //zad.3
    public static boolean czyParzysta(int c){
        if(c%2==0) return true;
        else return false;
    }
    //zad.4
    public static boolean czyPodzielna(int d){
        if(d%3==0 && d%5==0) return true;
        else return false;
    }
    //zad.5
    public static void Potega(int e){
        System.out.println(Math.pow(e,3));
    }
    //zad.6
    public static void Pierwiastek(int f){
        System.out.println(Math.sqrt(f));
    }
    //zad.7
    public static boolean czyTrojkat(int g, int h, int i){
        int gp=(int)(Math.pow(g,2));
        int hp=(int)(Math.pow(h,2));
        int ip=(int)(Math.pow(i,2));
        if(g+h>i && g+i>h && h+i>g && gp+hp==ip || gp+ip==hp || hp+ip==gp) return true;
        else return false;
    }
}
