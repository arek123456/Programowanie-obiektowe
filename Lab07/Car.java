package Lab07;

public class Car implements Moveable {
    String marka;

    public Car(String marka) {
        this.marka = marka;
    }

    @Override
    public void start() {
        System.out.println("Samochod, ktory ma marke "+marka+" rusza.");
    }

    @Override
    public void stop() {
        System.out.println("Samochod, ktory ma marke "+marka+" zatrzymal sie.");
    }
}
