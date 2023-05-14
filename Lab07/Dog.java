package Lab07;

public class Dog extends Animal implements Moveable,Speakable{
    public Dog(){
    }
    public Dog(String name){
        super(name);
    }

    @Override
    public String getTyp() {
        return "Pies";
    }

    @Override
    public void start() {
        System.out.println("Pies biegnie");
    }

    @Override
    public void stop() {
        System.out.println("Pies zatrzymal sie");
    }

    @Override
    public String getVoice(int voice) {
        if(LOUD==voice){
            return "szczekanie";
        }
        else if(QUIET==voice){
            return "szczekanie";
        }
        else{
            return null;
        }
    }
}
