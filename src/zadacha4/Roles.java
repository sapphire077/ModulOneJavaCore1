package zadacha4;

public class Roles {
    public static void main(String[] args) {
printTextPerRole(new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"}, new String[]{"Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?"});
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        for (String role : roles) {
            sb.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    sb.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
