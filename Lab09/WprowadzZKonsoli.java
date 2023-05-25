package Lab09;

import java.util.Scanner;

public class WprowadzZKonsoli {
    static public void Int() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj Int");
            int dane = input.nextInt();
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void Char() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj Char");
            char dane = input.next().charAt(0);
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void String() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj String");
            String dane = input.nextLine();
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void Long() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj Long");
            long dane = input.nextLong();
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void Short() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj Short");
            short dane = input.nextShort();
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void Float() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj Float");
            float dane = input.nextFloat();
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
    static public void Double() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Podaj Double");
            double dane = input.nextDouble();
        } catch (Exception w) {
            System.out.print("Wyjatek: ");
            System.out.println(w.getMessage());
        }
    }
}
