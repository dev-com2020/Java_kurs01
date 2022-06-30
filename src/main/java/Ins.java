public class Ins {
    public static void main(String[] args) {
        int pensja = 1001;
        int bonus = 0;

        if (pensja <= 500){
            bonus = 10;
            System.out.println(bonus);
        } else if (pensja == 1000) {
            bonus = 100;
            System.out.println(bonus);
        } else {
            bonus = 50;
            System.out.println(bonus);
        }

    }
}
