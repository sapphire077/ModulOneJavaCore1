package zadacha_3;

public class SwitchTime {
    public static boolean isWeekend(String weekday) {
        String day= "";
        switch (weekday){
            case "Monday":
                boolean a= false;
                System.out.println(a);
                break;
            case "Tuesday":
                boolean b= false;
                break;
            case "Sanday":
                boolean c=true;
                System.out.println("Ура"+c);
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        isWeekend("Monday");
    }

}
