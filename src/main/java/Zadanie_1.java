import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);

        System.out.print("Podaj długość boku a (w cm): ");
        double bok1 = pobierz.nextDouble();
        System.out.print("Podaj długość boku b (w cm): ");
        double bok2 = pobierz.nextDouble();
        double pole = bok1 * bok2;

//        System.out.printf("Pole prostokąta o bokach " + bok1 + " i " + bok2 + " wynosi: " + pole + " cm2");
        System.out.printf("Pole prostokąta o bokach %.0f i %.0f wynosi %.0f", bok1,bok2,pole);


    }
}
