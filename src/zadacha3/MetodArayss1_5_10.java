package zadacha3;

import java.util.Arrays;

public class MetodArayss1_5_10 {
    public static void main(String[] args) {
        int[] num = {1, 5, 2, 17};
        printArray(num);
    }

    public static void printArray(int[] numbers) {
        int left = (numbers.length - 1) / 2;

  int right=numbers.length==0 ? 0:left+2-numbers.length%2;
System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, left, right)));
        }

    }

