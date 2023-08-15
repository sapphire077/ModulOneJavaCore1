package zadacha3;

public class Array2 {
    public static void main(String[] args) {
int []num={1,3,5,6,9,11,24};
        System.out.print("[");
getSubArrayBetween(num,4,10);
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
for (int i=0; i<numbers.length;i++){
    int c= numbers[i];
    if (c>start&&c<end){
        System.out.print(c);
        if (c<end-1){
            System.out.print(", ");
        }
    }
}
        System.out.print("]");
        return numbers;

    }
}
