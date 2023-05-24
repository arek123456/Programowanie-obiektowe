package Lab09;

public class zad2 {
    public static void main(String[] args){
        try{
            System.out.println("6! = " + silnia(6));
            System.out.println("7! = " + silnia(7));
            System.out.println("-11! = " + silnia(-11));
        }catch (silniaException e){
            System.out.println("Error " + e.getMessage());
        }
    }

    public static int silnia(int n) throws silniaException{
        if (n < 0)
            throw new silniaException("Silnia musi > 0 ");
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}
class silniaException extends Exception{
    public silniaException(String message){
        super(message);
    }
}
