package Lab05;

public class kwadrat {
    double a;
    public kwadrat(double a){
        this.a = a;
    }
    public double pole_kwadratu(){
        double pole;
        pole = a*a;
        return pole;
    }
    public double obwod_kwadratu(){
        double obwod;
        obwod = 4*a;
        return obwod;
    }
    public void wyp_kwadratu(){
        System.out.println("Bok kwadratu wynosi: "+a);
        System.out.println("Pole kwadratu wynosi: "+pole_kwadratu());
        System.out.println("Obwod kwadratu wynosi: "+obwod_kwadratu());
    }
}
