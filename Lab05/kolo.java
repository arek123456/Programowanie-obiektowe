package Lab05;

public class kolo {
    double r;
    public kolo(double r){
        this.r = r;
    }
    public double pole_kola(){
        double pole;
        pole = Math.PI*Math.pow(r,2);
        return pole;
    }
    public double obwod_kola(){
        double obwod;
        obwod = 2*Math.PI*r;
        return obwod;
    }
    public void wyp_kola(){
        System.out.println("Promien kola wynosi: "+r);
        System.out.println("Pole kola wynosi: "+pole_kola());
        System.out.println("Obwod kola wynosi: "+obwod_kola());
    }
}
