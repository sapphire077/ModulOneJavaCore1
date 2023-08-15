package zadacha3;

public class OddNumbers1_5_12 { // вывести все нечетные числа
    public static void main(String[] args) {
        int[] num = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(num);
    }

    public static void printOddNumbers(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (c % 2 != 0) {
                System.out.print(c);
                if (i < arr.length - 2) {
                    System.out.print(", ");
                }

            }
        }
        System.out.print(" ]");

    }

}
