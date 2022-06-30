public class Five {
    public static void main(String[] args) {

        String imie = "Tomek";
        System.out.println("Witaj..." + imie);
        imie = imie.toUpperCase();
        imie = imie.substring(1,3); // od 1 do 3
//      imie = imie.substring(0,1); // nie wywołamy
        System.out.println("Witaj..." + imie);
        String slowo = "słowo";
        String adn = "nowe słowo";
        String wiadomosc = slowo + adn;
        System.out.println(wiadomosc);
        int age = 13;
        String rating = "RATING:" + age;
        System.out.println(rating);
        String all = String.join(" ",slowo,adn);
        System.out.println(all);
        String rep = "Java".repeat(3);
        System.out.println(rep);

        String greet = "Cześć!"; // chcę zmienić na słowo CZEKAJ
        greet = greet.substring(0,3) + "kaj"; // podłańcuch
        System.out.println(greet);

        System.out.println("czekaj".equalsIgnoreCase(greet)); // porównujemy zawartość
        System.out.println(4 == 4 ); // porównujemy adresu w pamięci!



    }

}
