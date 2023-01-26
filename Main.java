import java.util.Scanner;

class Main {
    public static int sum(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static String sum(String word, String text) {

        int len1 = word.length();
        int len2 = text.length();


        return String.valueOf((len1 + len2));
    }

    public static boolean sum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            return true;
        }
        if (number < 0) {
            return false;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sum(123));
        System.out.println(sum("word", "text"));
        System.out.println(sum() + " " + "massege: number > 0 ");
        System.out.println(sum() + " " + "massege: number < 0 ");

    }
}