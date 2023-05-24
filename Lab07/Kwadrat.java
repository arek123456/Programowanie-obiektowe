package Lab07;

public abstract class Kwadrat extends Prostokat implements IFigury{
    Kwadrat(int bok,String kolor){
        super(bok,bok,kolor);
    }

    public String opis(){
        return "Kwadrat wymiary: "+szer;
    }

    public void skaluj(float skala){
        System.out.println("Skalowana wartosc: |"+skala+"|, "+skala*szer + " x "+skala*szer);
    }

    public float getPowierzchnia(){
        return szer*szer;
    }

    public boolean wPolu(Punkt p){
        if(p.x <szer && p.y < szer) return true;
        else return false;
    }
}
