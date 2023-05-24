package Lab09;

public class zad3 {
    public static void main(String[] args){
        try {
            Adres adr1 = new Adres("Rejtana", "38-406", "Rzeszow", 23);
        }catch (adresException e){
            System.out.println("Blad tworzenia adresu: "+ e.getMessage());
        }
        try {
            Adres adr2 = new Adres(null, null, "", 23);
        }catch (adresException e){
            System.out.println("Blad tworzenia adresu: "+ e.getMessage());
        }
        try {
            Adres adr3 = new Adres("Rejtana", "38-406", "Rzeszow", -23);
        }catch (adresException e){
            System.out.println("Blad tworzenia adresu: "+ e.getMessage());
        }
    }
}
class Adres{
    private String ulica, kodPocztowy, miasto;
    private int nrDomu;
    public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) throws adresException {
        String error = "";
        if(ulica == null) error += "Ulica nie moze byc null ";
        if(kodPocztowy == null) error += "Kod pocztowy nie moze byc null ";
        if(miasto == null) error += "Miasto nie moze byc null ";
        if(nrDomu <= 0) error += "Numer domu nie moze byc <= 0 ";
        if(!error.equals("")) throw new adresException(error);

        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.nrDomu = nrDomu;
    }
}
class adresException extends Exception{
    public adresException(String message){
        super(message);
    }
}
