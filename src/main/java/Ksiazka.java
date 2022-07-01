public class Ksiazka {
    public String tytul;
    public String autor;
    private double cena;

    public boolean czyTakaSamaCena(Ksiazka innaKsiazka) {
        return cena == innaKsiazka.cena;
    }

    private boolean czyCenaJestPoprawna(double cenaDoSprawdzenia) {
        return cenaDoSprawdzenia > 0;
    }

    public void ustawCene(double nowaCena) {
        if (czyCenaJestPoprawna(nowaCena)) {
            cena = nowaCena;
        } else {
            System.out.println("Cena " + nowaCena + " jest nieprawidlowa!");
        }
    }
}