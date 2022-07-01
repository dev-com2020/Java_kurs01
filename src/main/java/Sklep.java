public class Sklep {
    public static void main(String[] args) {
        Produkt czeresnie = new Produkt();
        Produkt herbata = new Produkt();

        czeresnie.setCena(8.0); // 1
        czeresnie.setNazwa("Czeresnie"); // 2

        herbata.setCena(12.0); // 1
        herbata.setNazwa("Herbata czarna"); // 2
        // 3
        System.out.println("Nazwa pierwszego produktu to: " + czeresnie.getNazwa());
        System.out.println("Cena pierwszego produktu to: " + czeresnie.getCena());
        System.out.println(herbata);

        Produkt papryka = new Produkt(5.0,"Papryka");
        Produkt ogorek = new Produkt("Ogórek!");
        System.out.println(papryka);
        System.out.println(ogorek);
        }
    }
