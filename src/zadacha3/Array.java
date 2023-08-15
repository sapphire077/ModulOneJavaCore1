package zadacha3;

public class Array {
    public static void main(String[] args) {
        int[] num= {1,2,3,4,5};
        System.out.print("[");
printArray(num);
    }
    public static void printArray(int[] numbers) {


        for (int i=0; i<numbers.length;i++ ){
int c= numbers[i] ;
            System.out.print(c );
            if (i<numbers.length-1){
                System.out.print(", ");
            }

}System.out.println("]");
            }

        }




