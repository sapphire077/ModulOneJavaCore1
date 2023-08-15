package zadacha3;

public class Array_revers {
    public static void main(String[] args) {
        int [] num={1,4,6,7};
inverseArray(num);
        System.out.print("]");
    }

    public static int[] inverseArray(int[] numbers) {
        System.out.print("[");
        for (int i= numbers.length-1; i>=0;i--){
            int c= numbers[i];
            System.out.print(c);

           if (i>0){
              System.out.print(", ");
           }
        }
        return numbers;
    }

}
