package Lab10;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class zad5 {
    public static void main(String[] args) {
        List<Integer> liczby1 = new LinkedList<>();
        liczby1.add(5);
        liczby1.add(9);
        liczby1.add(14);
        ListIterator<Integer> liczby2 = liczby1.listIterator();
        while (liczby2.hasNext()) {
            System.out.println(liczby2.next());
        }
        while (liczby2.hasPrevious()) {
            System.out.println(liczby2.previous());
        }
    }
}
