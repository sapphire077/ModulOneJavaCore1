package zadacha4;

public class String1_6_8 { //Задача 1.6.8
    public static void main(String[] args) {
        String1_6_8 a= new String1_6_8(); //делаем новый экз класса чтоб вызвать не статик метод
        a.parseAndPrintNumber("1200");


    }
    public void parseAndPrintNumber(String str) {

int num1= Integer.parseInt(str)/2; //создаем переменную инт и преобразуем текст в инт после чего значение делим на 2
        System.out.println(num1);
    }
}
