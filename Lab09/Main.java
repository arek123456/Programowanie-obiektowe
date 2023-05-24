package Lab09;

public class Main {
    public static void main(String[] args){
        System.out.println(getNumber(10));
        try{
            int wynik = 8/0;

        }catch( ArithmeticException e){
            System.out.println("ArithmeticException -> " + e.getMessage());
        }
        finally {
            System.out.println("Blok finally");
        }
    }
    public static int getNumber(int hour){
        if(hour < 0)
            throw new IllegalArgumentException("Liczba nie moze byc ujemna");
        return hour*60*60;
    }
}

