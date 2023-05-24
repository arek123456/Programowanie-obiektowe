package Lab07;

    public class Okrag extends Figura1 implements RuchFigury{

        double promien;
        public Punkt srodek;

        public Okrag(double promien, Punkt srodek){
            this.promien = promien;
            this.srodek = srodek;
        }

        public void przesun(int x, int y){
            this.srodek.x += x;
            this.srodek.y += y;
        }

        public String opis(){
            return "Okrag o wymiarach: ("+ srodek.x + ", " + srodek.y +") i promieniu: " + promien;
        }

        public void skaluj(float skala){
            System.out.println("Przeskalowana wartosc: |"+ skala +"|, ("+ skala*srodek.x + ", " + skala*srodek.y +") i promieniu: " + skala*promien);
        }
    }
