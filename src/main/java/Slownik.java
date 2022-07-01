import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slownik {
    public static void main(String[] args) {
        Map<Integer,String> pracownicy = new TreeMap<>();
        pracownicy.put(14,"Kowalski");
        pracownicy.put(32,"Rowalski");
        pracownicy.put(3,"Nowalski");

        System.out.println("Ilość pracowników "+ pracownicy.size());
        System.out.println(pracownicy.get(14));

        Set<Integer> keySet = pracownicy.keySet();
        System.out.println("Klucze:\n" + keySet);
        Collection<String> values = pracownicy.values();
        System.out.println("Wartości:\n" + values);

        Set<Map.Entry<Integer,String>> entrySet = pracownicy.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
