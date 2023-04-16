package Lab06;

public class Prostokat extends Figura{
    double wys=0, szer=0;

    Prostokat(double wys,double szer) {
        this.wys = wys;
        this.szer = szer;

    }
    Prostokat(float wys,float szer, String kolor){
        this(wys,szer);
        this.kolor = kolor;
    }

    public void przesun(float x, float y){
        this.wys+=x;
        this.szer+=y;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }
}
