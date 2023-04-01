package Lab05;

public class prostokat {
    double a, b;
    public prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double pole_prostokata(){
        double pole;
        pole = a*b;
        return pole;
    }
    public double obwod_prostokata(){
        double obwod;
        obwod = 2*(a+b);
        return obwod;
    }
    public void wyp_prostokata(){
        System.out.println("Boki prostokata wynosza: "+ a +", " +b);
        System.out.println("Pole prostokata wynosi: "+pole_prostokata());
        System.out.println("Obwod prostokata wynosi: "+obwod_prostokata());
    }
}
