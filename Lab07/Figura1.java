package Lab07;

    public abstract class Figura1{

        //pola metody i kontruktory
        Punkt punkt;
        String kolor = "bialy";


        Figura1(){
            punkt = new Punkt(0,0);
        }
        Figura1(String kolor){
            this.kolor=kolor;
        }
        Figura1(Punkt punkt){
            this.punkt=punkt;
        }
        String getKolor(){
            return kolor;
        }
        //metody abstrakcyjne
        public abstract String opis();

        public abstract void skaluj(float skala);

    }
