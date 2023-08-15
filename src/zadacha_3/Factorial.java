package zadacha_3;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
factorial(10);
    }

    public static BigInteger factorial(int value) {
int c=1;
        for (int i=1; i<=value;i++){
 c*=i;


} System.out.println(c);
        return null;
    }

}
