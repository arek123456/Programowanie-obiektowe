package Lab06;

public class Punkt {
    public double x,y;

    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void zeruj(){
        x = 0.0;
        y = 0.0;
    }
    public void opis(){
        //super.opis();
        System.out.println("Punkt o wspolrzednych: ["+x+","+y+"]");
    }
    public void przesun(int x, int y){
        this.x+=x;
        this.y+=y;
    }
}
