public class ZwrocWynikDzielenia {
    public static void main(String[] args) {

        try {
            System.out.println(podziel(10, 0));
        } catch (Exception e) {
//            System.out.println("Nie wolno dzielić przez zero");
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }finally {
            System.out.println("Bloki zostały wykonane");

        }
        System.out.println(podziel(25, 5));
    }
    public static int podziel(int x, int y) {
        return x / y;
    }
}