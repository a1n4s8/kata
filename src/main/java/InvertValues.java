import java.util.Arrays;

public class InvertValues {

    public static void main(String[] args) {
        int ts[] = {-1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(invert(ts)));
    }

    private static int[] invert(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }

        return array;
    }
}