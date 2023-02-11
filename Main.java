import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int a = array[0] - array[1];
        int b = array[0] - array[2];
        int c = array[0] - array[3];

        if (a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}