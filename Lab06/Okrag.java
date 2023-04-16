package Lab06;

public class Okrag extends Figura{
    public Punkt srodek;
    double promien;

    public Okrag() {
        srodek.x = 0.0;
        srodek.y = 0.0;
        promien = 0.0;
    }

    double getPowierzchnia() {
        return (Math.PI*Math.pow(promien,2));
    }
    double getSrednica() {
        return (2*promien);
    }
    public void setPromien(double p) {
        this.promien = 2.1;
    }
    double getPromien() {
        return promien;
    }
    public void wSrodku(){
        if(Math.pow(punkt.x-srodek.x,2)+Math.pow(punkt.y-srodek.y,2)<=Math.pow(promien,2)){
            System.out.println("Dany punkt znajduje sie wewnatrz okregu");
        }
        else{
            System.out.println("Dany punkt nie znajduje sie wewnatrz okregu");
        }
    }
}
