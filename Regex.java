import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String number = "+380933228148";

        String template = "\\+380*\\d{9}";
        boolean matches = Pattern.matches(template, number);

        System.out.println(matches);
    }
}