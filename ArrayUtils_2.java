import java.util.Scanner;
import java.util.Random;
public class ArrayUtils_2 {


    public static int[] readArray(Scanner scan, int n, int High, int Lov) {
        Random r = new Random();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {

            mas[i] = r.nextInt(High - Lov + 1) + Lov;
        }
        return mas;
    }
    //знаходення кількості від'ємних елементів
    public static int countNegativeElements(int[] mas) {
        int m = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                m++;
            }
        }
        return m;
    }
    public static void printElem(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%d", mas[i]);
            System.out.print(",\t");
        }
        System.out.println();
    }

    //знажодження найменшого елементу
    public static int findMin(int[] mas) {
        int min = Integer.MAX_VALUE;
        int minIn = -1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                minIn = i;
            }
        }
        return minIn;
    }
    // знажодження суми після самого меншого числа
    public static int sumAfterMin(int[] mas, int minIndex) {
        int sumMin = 0;
        for (int i = minIndex + 1; i < mas.length; i++) {
            sumMin += mas[i];
        }
        return sumMin;
    }
}
