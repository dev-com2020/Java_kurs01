import java.util.Arrays;

public class Tab {

    public static void main(String[] args) {

        int[] tablica = new int[15];
        String[] pracownicy = {"Adam","Jola","Tomek","Anna"};
//        String[] dluznicy = new String[10];


        for (int i = 0; i < 10; i++)
            tablica[i] = i + 1;

//        System.out.println(tablica[0]);
//        System.out.println(tablica[9]);
//        System.out.println(tablica[5]);
//
//        for (int i=0; i < 15;i++)
//            System.out.println("Kolejna komórka to: " + tablica[i]);

        for (int x: tablica){ //for each
            System.out.println(x);
        }

        for (int i=0; i < 4;i++)
            System.out.println("Kolejna komórka to: " + pracownicy[i]);

        System.out.println(tablica.length);

        String napis = "tutaj napis";
//        napis.chars().forEach(i -> System.out.println((char)i));

        Arrays.stream(tablica).forEach(i -> System.out.println("Tab.main: " + i));


        char arr[] = napis.toCharArray();

        for(char c: arr){
            System.out.println(c);
        }

    }
}
