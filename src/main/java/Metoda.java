public class Metoda {

    public static void main(String[] args) {


        System.out.println(czyBonus(5));
        int suma = wyniki(5, 5);
        int suma2 = wyniki(wyniki(3, 4), 5);
        System.out.println(suma);
        System.out.println(suma2);
        powitanie();

    }

    static boolean czyBonus(int cyfra) {
        return cyfra > 100;
    }


    static int dodawanie(int cyfra1, int cyfra2) {
        return cyfra1 + cyfra2;
    }

    static int wyniki(int cyfra1, int cyfra2) {
        int suma = cyfra1 + cyfra2;
        for (int i = 0; i < 2; i++) {
            suma++;
        }

        return suma;

    }

    static void powitanie() {
        System.out.println(2 + 2);
    }
}
