package zadacha4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Post1_6_11 {
    public static void main(String[] args) {
        isGmailOrOutlook("12ff@GmaIl.com");

    }

    public static boolean isGmailOrOutlook(String email) {
        String email1= "@gmail.com";
        Pattern pattern = Pattern.compile("(?i).@gmail.com"); //(?i) нужен чтоб не учитывать регистр
         Pattern pattern1 = Pattern.compile("(?i).+@outlook.com");
        Matcher matcher = pattern.matcher(email);
        Matcher matcher1 = pattern1.matcher(email);
        if (matcher.find()) {
            System.out.println(true + "  почтовый ящик принадлежит Гугл, а именно:" +
                    email.substring(matcher.start(), matcher.end()));
            return true;
        }
        if (matcher1.find()) {
            System.out.println(true + " почтовый ящик принадлежит Майкрософт, а именно: "
                    + email.substring(matcher1.start(), matcher1.end()));
            return true;
        } else
            System.out.println(" эмейл не соответсвует заданным требованиям");
            return false;

    }

}