public class First {
    public static final int liczba = 21;
    public static int liczba3 = 3;

    public enum Rozmiar {
        MAŁY,
        ŚREDNI,
        DUŻY,
        EKSTRA_DUŻY
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
        Rozmiar s = Rozmiar.MAŁY;

        boolean zrobione = true;
        int wynik = (liczba + liczba3) * liczba2;
        System.out.println(liczba - liczba2 - liczba3 + " To jest wynik");

        // Super kod od Tomka
    }
}