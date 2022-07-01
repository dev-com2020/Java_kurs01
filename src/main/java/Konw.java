import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class Konw {
    public static void main(String[] args) throws IOException {

//        File plik = new File("mojplik.txt"); // tworzy plik
//        plik.createNewFile()

//        Scanner in = new Scanner(plik); //odczyt
//        String tekst = in.nextLine();
//        String tekst2 = in.nextLine();
//        System.out.println(tekst + "\n" +  tekst2);


        Scanner in = new Scanner( Path.of("mojplik.txt"));


        String tekst = in.nextLine();
        String tekst2 = in.nextLine();
        System.out.println(tekst + "\n" +  tekst2);







        System.out.printf("%tc\n", new Date());
        System.out.printf("%1$s %2$te %2$tB %2$tY\n", "Termin płatności:", new Date());
        System.out.printf("%s %te %<tB %<tY", "Termin płatności: ", new Date());
    }
}
