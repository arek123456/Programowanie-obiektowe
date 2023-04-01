package Lab05;

public class stozek {
    double r, l, h;

    public stozek(double r, double l, double h){
        this.r = r;
        this.l = l;
        this.h = h;
    }
    public double pole_stozka(){
        double pole;
        pole = Math.PI*r*(r + l);
        return pole;
    }
    public double objetosc_stozka(){
        double objetosc;
        objetosc = (1/3)*r*r*h*Math.PI;
        return objetosc;
    }
    public void wyp_stozka(){
        System.out.println("Promien, tworzaca i wysokosc stozka wynosza: "+ r +", " + l+", " +h);
        System.out.println("Pole stozka wynosi: "+pole_stozka());
        System.out.println("Objetosc kuli wynosi: "+ objetosc_stozka());
    }
}
