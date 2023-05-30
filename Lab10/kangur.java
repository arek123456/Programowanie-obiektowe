package Lab10;

public class kangur {
    int numerKangura;

    public kangur(int nrKangura) {
        this.numerKangura = nrKangura;
    }

    public void skok(){
        System.out.println("Podskok kangura numer: " + numerKangura);
    }

    @Override
    public String toString() {
        return "nrKangura=" + numerKangura;

    }
}
