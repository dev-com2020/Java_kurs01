public class Samochod {

    private int predkosc;
    private String kolor;


    public void ustawPredkosc(int nowaPredkosc){
        predkosc = nowaPredkosc;
    }
    public void ustawKolor(String nowyKolor){
        kolor = nowyKolor;
    }

//    public void wypiszInfo(){
//        System.out.println("Jestem autkiem, mój kolor to " + kolor + ", jadę z prędkością " + predkosc);
//    }

        public String toString(){
        return "Jestem autkiem, mój kolor to " + kolor + ", jadę z prędkością " + predkosc;
    }

}

