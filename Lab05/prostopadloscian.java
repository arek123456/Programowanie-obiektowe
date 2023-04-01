package Lab05;

public class prostopadloscian {
    double a,b,c;

    public prostopadloscian(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double pole_prostpadloscianu(){
        double pole;
        pole = 2*(a*b+b*c+a*c);
        return pole;
    }
    public double objetosc_prostopadloscianu(){
        double objetosc;
        objetosc = a*b*c;
        return objetosc;
    }
    public void wyp_prostopadloscianu(){
        System.out.println("Boki prostopadloscianu wynoszą: "+ a+", " +b +", " +c);
        System.out.println("Pole prostopadloscianu wynosi: "+pole_prostpadloscianu());
        System.out.println("Objetosc prostopadloscianu wynosi: "+objetosc_prostopadloscianu());
    }
}
