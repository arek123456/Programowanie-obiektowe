package Lab07;


public abstract class Trojkat extends Figura1 implements IFigury{
    int wys=0;
    int podst=0;
    Trojkat(int wys,int podst,String kolor){

        this.wys = wys;
        this.podst = podst;
        super.kolor = kolor;
    }
    public String opis(){
        return "Trojkat o wymairach: "+wys+" x "+podst;
    }

    public void skaluj(float skala){
        System.out.println("przeskalowana wartosc: |"+ skala +"|, " + skala*wys + " x "+ skala*podst);
    }

    public float getPowierzchnia(){
        return (podst * wys)/2;
    }
    public boolean wPolu(Punkt p){
        if(p.x < podst && p.y < wys) return true;
        else return false;
    }
}