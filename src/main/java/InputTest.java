import java.io.Console;
import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



//        pobieramy porcję danych
        System.out.print("Jak się nazywasz?: ");
        String name = in.nextLine();

//        pobieranie drugiej porcji
        System.out.print("Ile masz lat?: ");
        int age = in.nextInt();

//        System.out.println("Witaj " + name + ". W przyszłym roku będziesz miał " + (age + 1) + " lat.");
        System.out.printf("%, .2f\n", 10000.0 / 3.0); // 3 333.33
        System.out.printf("Witaj, %s. W przyszłym roku będziesz mieć lat %d", name, ++age); // %s, %d, %.2f

//        Console cons = System.console();
//        String user = cons.readLine("Nazwa użytkownika: ");
//        char[] passwd = cons.readPassword("Hasło: ");


    }
}
