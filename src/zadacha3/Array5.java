package zadacha3;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
int []num= {1, 5, 2, 17};
getArrayMiddle(num);
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length<=2){
            return numbers;
        }
        if (numbers.length%2==0){
            int[] arr= new  int[2];
            arr[0]=numbers[numbers.length/2-1];
            arr[1]=numbers[numbers.length/2];
            System.out.println(Arrays.toString(arr));
            return arr;

        }else {
            int[]arr=new int[1];

        arr[0]= numbers[numbers.length/2];
            System.out.println(Arrays.toString(arr));

    }

        return numbers;
    }
}