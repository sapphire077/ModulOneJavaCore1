package zadacha3;

import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
       int []num1= {1, 3, 7, 5};
        int [] num2 = {8, 4, 2, 4};

        mergeAndSort(num1,num2);

    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int []bigArray= new  int[firstArray.length+ secondArray.length];
        int count=0;
        for (int i=0;i<firstArray.length;i++){
            bigArray[i]=firstArray[i];
            count++;
        }
        for (int i=0;i< secondArray.length;i++){
            bigArray[count++]=secondArray[i];

        }
        Arrays.sort(bigArray);
            System.out.println( Arrays.toString(bigArray));


        return bigArray;
    }


}
