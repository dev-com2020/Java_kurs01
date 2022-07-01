public class ZmienneTypowZlozonych {
    public static void main(String[] args) {

        Samochod bmw = new Samochod();
        bmw.ustawKolor("Czarny");
        bmw.ustawPredkosc(260);
//
        Samochod skoda = bmw;
        skoda.ustawKolor("Biały");

        System.out.println(bmw);
        System.out.println(skoda);


    }
}
