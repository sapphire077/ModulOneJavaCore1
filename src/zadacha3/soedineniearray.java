package zadacha3;

public class soedineniearray {
    public static void main(String[] args) {
        int[] num1={1,3,7,5};
                int[] num2={8,4,2,4};
        mergeAndSort(num1,num2);

    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {

        int [] bigArray= new int[(firstArray.length+secondArray.length)] ;
        int count=0;
        for (int i=0; i<firstArray.length;i++){
            bigArray[i]=firstArray[i];
            count++;
        }
        for (int j=0;j<secondArray.length;j++){
            bigArray[count++]=secondArray[j];

        }
        for (int i=0;i<bigArray.length;i++){
    int c= bigArray[i];

}
for (int i=0; i<bigArray.length;i++){
       for (int j= bigArray.length-1;j>i; j--){
        if (bigArray[j]>bigArray[j-1]){
            int n= bigArray[j];
            bigArray[j]=bigArray[j-1];
            bigArray[j-1]=n;
            System.out.println(n);
        }

    }
}



        return bigArray;
    }

}
