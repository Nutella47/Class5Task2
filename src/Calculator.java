import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            // Obtain a number between [0 - 99].
            int n = rand.nextInt(100);
            array[i] = n + 1;
        }

        int min = 101, max = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min : " + min + ", Max : " + max);
    }
}

