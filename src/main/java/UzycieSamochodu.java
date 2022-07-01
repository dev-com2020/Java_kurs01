public class UzycieSamochodu {
    public static void main(String[] args) {

        Samochod bmw = new Samochod();
        bmw.ustawKolor("Czarny");
        bmw.ustawPredkosc(260);
//        bmw.wypiszInfo();

        Samochod skoda = new Samochod();
        skoda.ustawKolor("Czerwony");
        skoda.ustawPredkosc(300);
//        skoda.wypiszInfo();


        System.out.println(skoda);
//
//
//        String opisAuta = bmw.toString();
//        String dokladniejszyOpis = "Opis zmiennej bmw to: " + bmw;
//
//        System.out.println(opisAuta);
//        System.out.println(dokladniejszyOpis);
//    }
    }
}
