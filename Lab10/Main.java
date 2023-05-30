package Lab10;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, kangur> mapa = new HashMap<>();
        mapa.put("Jacek", new kangur(9));
        mapa.put("Marta", new kangur(2));
        mapa.put("Adam", new kangur(21));
        mapa.put("Ola", new kangur(45));
        mapa.put("Kacper", new kangur(32));

        Iterator<String> iterator = mapa.keySet().iterator();
        while (iterator.hasNext()) {
            kangur kangurek = mapa.get(iterator.next());
            System.out.println(iterator.next());
            kangurek.skok();
        }
    }
}