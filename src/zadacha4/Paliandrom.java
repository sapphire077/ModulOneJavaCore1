package zadacha4; //задача 1.6.9

public class Paliandrom {
    public static void main(String[] args) {
        isPalindrome("Was it a cat I saw?");
    }

    public static boolean isPalindrome(String text) {
        String filter1 = text.replaceAll("[^a-zA-Z0-9]", ""); // удаляем все символы кроме букв и цифр
        String sb = new StringBuffer(filter1).reverse().toString(); //делаем реверс

        if (filter1.equalsIgnoreCase(sb)) {
            boolean palindrom = true;
            System.out.println("значение: " + palindrom + " является палиандром ");
        } else {
            boolean palindtom = false;
            System.out.println("значение: " + palindtom + " не  является палиндромом");
            return palindtom;
        }
        return true;
    }
}
