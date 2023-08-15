package zadacha_2;

public class Vozrast {
    public static void main(String[] args) {
        getAgeDiff((byte) 2, (byte) (5));
    }

    private static byte getAgeDiff(byte age1, byte age2) {
        if (age1 < age2) {
            int raznitsya = (age2 - age1);
            byte c = (byte) (raznitsya);
            System.out.println(c);
        } else {
            int raznitsya2 = age1 - age2;
            byte c1 = (byte) (raznitsya2);
            System.out.println(c1);

        }
        return 1;

    }
}

