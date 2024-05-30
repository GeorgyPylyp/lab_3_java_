import java.util.Scanner;
public class ArrayUtils {

    //введення масиву
    public static int[] readArray(Scanner scan, int n) {
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            while (true) {
                System.out.println("Введіть елемент масиву №" + i);
                if (scan.hasNextInt()) {
                    int elem = scan.nextInt();
                    mas[i] = elem;
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }
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
