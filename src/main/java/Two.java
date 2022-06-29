import java.math.BigDecimal;
import java.math.BigInteger;

public class Two {

    public static void main(String[] args) {
        BigInteger pierwsza = new BigInteger("897423879623476534267832467342987342987564656546546456456456456544342");
        BigInteger druga = new BigInteger("12155121212121212678324673429873429876564664646464564564542424114365467567542342");
        BigInteger suma = pierwsza.multiply(druga);
        BigDecimal a = new BigDecimal("9.5");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = new BigDecimal("0.33");
        System.out.println(a.divideToIntegralValue(b.multiply(c)));

        System.out.println("Suma: "+ suma);

    }
}
