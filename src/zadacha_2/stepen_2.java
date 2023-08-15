package zadacha_2;

public class stepen_2 {
    public static void main(String[] args) {
isPowerOfTwo(-2);
    }

    public static boolean isPowerOfTwo(int value) {
        int modul = Math.abs(value);
        int stepen = (int) Math.pow(modul, 2);
        if (stepen != 0) {
            boolean a = true;
            System.out.println(a);
return true;

        } else if (stepen <= 0) {
            boolean b=false;
            System.out.println(b);
            return  false;

        }
        return true;
    }

}
