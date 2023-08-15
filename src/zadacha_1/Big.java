package zadacha_1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        System.out.println(doubleExpression(10.0,1,20.0));

    }

    public static boolean doubleExpression(double a, double b, double c) {
        if (a + b == c) {
            return true;
        } else
            return false;
    }
}
