public class Stetek {
    public int liczbaZagli;
    public String nazwa;

    public String toString() {
        return "Statek o nazwie " + nazwa + " ma " + liczbaZagli + " żagli.";
    }

    public static void main(String[] args) {
        Stetek nieznany = new Stetek();

        Stetek perla = new Stetek();
        perla.nazwa = "Czarna Perła";

        System.out.println(nieznany);
        System.out.println(perla);
    }

}
