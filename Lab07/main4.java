package Lab07;

public class main4 {
    public static void main(String[] args) {
        Car samochod = new Car("Audi");
        samochod.start();
        samochod.stop();
        Dog pies = new Dog("Lili");
        pies.start();
        pies.stop();
        System.out.println(pies.getVoice(0));
        //wyscig
        /*public static void wyscig(Moveable...moveables){
            for (Moveable m : moveables) {
                m.start();
                if(m instanceof Dog)
                    System.out.println("Imie psa: "+((Dog)m).getName());
            }
        }
        //testowanie wyscigu
        wyscig(new Bike(), new Dog("Borys"), new Car("Opel"));*/

    }
}
