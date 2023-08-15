package zadacha3;

public class Array3 {
    public static void main(String[] args) {
int [] num= {14,16,3};
getArrayMiddle(num);
        System.out.print("]");
    }


    	public static int[] getArrayMiddle(int[] numbers) {

            System.out.print("[");
            if (numbers.length>2){
                if (numbers.length%2==0){
                int [] arr= new int[2];
                arr[0]=numbers[numbers.length/2-1];
                arr[1]=numbers[numbers.length/2];
                for (int i=0;i<arr.length;i++) {
                    int c= arr[i];
                    System.out.print(c);
                    if (i<arr.length-1){
                        System.out.print(", ");
                    }

                }
                    return arr;
            }else {
                    int [] arr=new int[1];
                    arr[0]=numbers[numbers.length/2];
                    for (int i=0;i<arr.length;i++) {
                        int c= arr[i];
                        System.out.print(c);

                        }

                    }
                             }




            return numbers;

        }


}
