import java.util.Scanner;
public class lab_3_z_2_2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            int n = 0;
            int High = 0;
            int Lov = 0;

            while (true) {
                System.out.println("Введіть n:");
                if (scan.hasNextInt()) {
                    n = scan.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }
            while (true) {
                System.out.print("введіть максимальне значення = ");
                if (scan.hasNextInt()) {
                    High = scan.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }
            while (true) {
                System.out.print("Введіть мінімальне значення = ");
                if (scan.hasNextInt()) {
                    Lov = scan.nextInt();
                    if (Lov > High) {
                        System.out.println("Помилка: Мінімальне значення не повинно бути більшим за максимальне.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // Очищення неправильного вводу
                }
            }

                int[] mas = ArrayUtils_2.readArray(scan, n, High, Lov);

                int m = ArrayUtils_2.countNegativeElements(mas);
                int minIn = ArrayUtils_2.findMin(mas);
                int sumMin = ArrayUtils_2.sumAfterMin(mas, minIn);

                ArrayUtils_2.printElem(mas);


                System.out.println("кількість від'ємних елементів=" + m);
                System.out.println("найменший елемент масиву: mas[" + minIn + "] = " + mas[minIn]);
                System.out.println("сума елементів після найменшого: " + sumMin);

                System.out.println("чи бажаєте ви прожовжити ?");
                String esno = scan.next();
                if (esno.equalsIgnoreCase("так")) {

                } else if (esno.equalsIgnoreCase("ні")) {
                    break;
                } else {
                    System.out.println(" помилка");
                    System.out.println("дайте відповідь так або ні");
                    esno = scan.next();
                    if (esno.equalsIgnoreCase("так")) {

                    } else if (esno.equalsIgnoreCase("ні")) {
                        break;
                    }
                }

            }
        }
    }
