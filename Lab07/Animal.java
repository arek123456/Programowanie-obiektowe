package Lab07;

public abstract class Animal {
    private String name = "bez imienia";

    public Animal(String name) {
        this.name = name;
    }
    public Animal(){
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Zwierzę{" +
                "name='" + name + '\'' +
                '}';
    }
    public abstract String getTyp();
}
