import static java.lang.Math.sqrt;

public class First {
    public static final int liczba = 21;
    public static int liczba3 = 3;

    public enum Rozmiar {
        MALY,
        SREDNI,
        DUZY,
        EKSTRA_DUZY
    }

    /**
     * jest to komentarz wieloliniowy
     *
     * @version 1.0
     * @author Tomek
     */
    public static void main(String[] args) {
        System.out.println("nie bede sie wital!");
        System.out.println("A \"jednak\" się przywitam!");
        int liczba2 = 21;
        Rozmiar s = Rozmiar.MALY;
        double x = 4;
        double y = sqrt(x);


        System.out.println(y);
        boolean zrobione = true;
        int wynik = (liczba + liczba3) * liczba2;
        System.out.println(liczba - liczba2 - liczba3 + " To jest wynik");

        // Super kod od Tomka
    }
}