import java.util.ArrayList;
import java.util.List;

public class Listy {

    public static void main(String[] args) {

        int liczba = 4;

        List lista1 = new ArrayList();
        lista1.add("Tomek");
        lista1.add(4);
        lista1.add(4.34);
        lista1.add(liczba);


        List<String> lista2 = new ArrayList<>();
        lista2.add("Tomek");
        lista2.add("5");
//        lista2.remove(1);
//        lista2.clear();
        System.out.println(lista2.get(1).getClass());



        List<Integer> lista3 = new ArrayList<Integer>();


        System.out.println(lista1.get(0));


        System.out.println(lista1.get(2).getClass());
    }
}
