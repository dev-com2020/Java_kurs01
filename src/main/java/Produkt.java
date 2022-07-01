public class Produkt {
    private double cena; // 1
    private String nazwa; // 2
    private int ilosc;

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Produkt(){}

    public Produkt(double cena, String nazwa){
        this.cena = cena;
        this.nazwa = nazwa;
    }
    public Produkt(String nazwa){
        this.cena = 5.0;
        this.nazwa = nazwa;
    }

    public Produkt(String nazwa, int ilosc){
        this.cena = 3.0;
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }


    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString() {
        return "Produkt o nazwie " + nazwa + " kosztuje " + cena;
    }
}