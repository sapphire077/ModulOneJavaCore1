package zadacha_1;

public class radius {
    public static void main(String[] args) {
calcCircleRadius(10);
    }
    public static void calcCircleRadius(double area) {
        double radius=Math.sqrt(area/Math.PI);
        System.out.printf("%.3f", radius);
    }

}
