import java.util.Set;
import java.util.TreeSet;

public class Zestawy {
    public static void main(String[] args) {
        Set<Integer> liczby = new TreeSet<>();
        liczby.add(4);
        liczby.add(42);
        liczby.add(1);
        liczby.add(39);
        liczby.add(333);
        liczby.add(333);

        Set<String> imiona = new TreeSet<>();
        imiona.add("Tomek");
        imiona.add("Ania");
        imiona.add("Tomek");

//        System.out.println(imiona);


//        System.out.println(liczby);
        for(int l:liczby){
            System.out.println(l);
        }

        System.out.println(liczby.contains(333));



    }

}
