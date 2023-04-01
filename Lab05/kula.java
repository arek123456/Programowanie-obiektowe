package Lab05;

public class kula {
    double r;

    public kula(double r){
        this.r = r;
    }

    public double pole_kuli(){
        double pole;
        pole = 4*Math.PI*Math.pow(r,2);
        return pole;
    }
    public double objetosc_kuli(){
        double objetosc;
        objetosc = (4/3)*Math.PI*Math.pow(r, 3);
        return objetosc;
    }
    public void wyp_kula(){
        System.out.println("Promien kuli wynosi: "+ r);
        System.out.println("Pole kuli wynosi: "+pole_kuli());
        System.out.println("Objetosc kuli wynosi: "+objetosc_kuli());
    }
}
