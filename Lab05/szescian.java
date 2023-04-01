package Lab05;

public class szescian {
    double a;
    public szescian(double a){
        this.a = a;
    }
    public double pole_szescianu(){
        double pole;
        pole = 6*a*a;
        return pole;
    }
    public double objetosc_szescianu(){
        double objetosc;
        objetosc = Math.pow(a, 3);
        return objetosc;
    }
    public void wyp_szescianu(){
        System.out.println("Bok szescianu wynosi: "+a);
        System.out.println("Pole szescianu wynosi: "+pole_szescianu());
        System.out.println("Objętosc szescianu wynosi: "+objetosc_szescianu());
    }
}
