package zadacha_1;

public class newComputers {


    public static int drawisMonitorsCounter(int monitors, int programmers) {

        int dostanutsya = monitors / programmers;
        int vozvrat = monitors % programmers;
        System.out.println("каждому програмисту достанется:" + dostanutsya +
                "компьютеров" + "вернется обратно на склад" + vozvrat + " компьютеров");
        return monitors % programmers;
    }

    public static void main(String[] args) {
        drawisMonitorsCounter(10, 4);

    }
}
