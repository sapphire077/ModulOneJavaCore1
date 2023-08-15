package zadacha_3;

public class Groups {


    public int determineGroup(int age) {


        if (age >= 7 && age <= 13) {

            return 1;
        } else if (age >= 14 && age <= 17) {
            System.out.println(2);
            return 2;

        } else if (age <= 18 && age <= 65) {
            System.out.println(3);
            return 3;
        } else System.out.println(-1);
        return 0;

    }


    public static void main(String[] args) {
        Groups gr = new Groups();
        System.out.println(gr.determineGroup(12));
    }
}

