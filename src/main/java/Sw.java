public class Sw {
    public static void main(String[] args) {
        int liczba = 1;

        switch (liczba) {
            case 1:
                // jakaś instrukcja
                System.out.println("1");
                break;
            case 2:
                // jakaś instrukcja
                System.out.println("2");
                break;
            case 3:
                // jakaś instrukcja
                System.out.println("bingo!");
                break;
            default:
                // jakaś instrukcja
                System.out.println("Ja i tak sobie wykonam kod...");

        }
        String sezon = "Lato";
        String poraRoku = switch (sezon) {
            case "Zima":
                yield "Winter";
            case "Lato":
                yield "Summer";
            default:
                yield "Nie znam pory roku";
        };
        System.out.println(poraRoku);


        String sezon2 = "Zima";
        String poraRoku2 = switch (sezon2) {
            case "Zima", "Zimno" -> "Winter";
            case "Lato" -> "Summer";
            default -> "Nie znam pory roku";
        };
        System.out.println(poraRoku2);

    }
}


