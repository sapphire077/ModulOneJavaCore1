package zadacha4;

public class Parce_sqr1_6_10 { // задача 1.6.10
    public static void main(String[] args) {
 Parce_sqr1_6_10 n= new Parce_sqr1_6_10();
 n.parseAndSqrt("5");

    }

    public long parseAndSqrt(String number) {
       long num= Integer.parseInt(number);
      long num1=  Math.round(Math.sqrt(num));
        System.out.println(num1);
        return num1;
    }

}
