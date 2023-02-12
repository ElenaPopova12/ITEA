import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
        int result = 0;
        int[] array = new int[]{4, 6, 8, 4};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int rezult = array[i] / 2;
            int[] array1 = new int[]{rezult};
            try {
                System.out.println(Arrays.toString(array1));
            } catch (ArithmeticException exception) {
                System.out.println("Exception was caught");
            }
        }
    }
}