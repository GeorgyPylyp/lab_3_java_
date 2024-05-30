import java.util.Scanner;

public class lab_3_z_2 {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            int n = 0;
            while (true) {
                System.out.println("Введіть n:");
                if (scan.hasNextInt()) {
                    n = scan.nextInt();
                    break;
                } else {
                    System.out.println("Помилка: введене значення не є числом. Спробуйте ще раз.");
                    scan.next(); // повторення вводу
                }
            }

            int[] mas = ArrayUtils.readArray(scan, n);
            int m = ArrayUtils.countNegativeElements(mas);
            int minIn = ArrayUtils.findMin(mas);
            int sumMin = ArrayUtils.sumAfterMin(mas, minIn);

            System.out.println("кількість від'ємних елементів=" + m);
            System.out.println("найменший елемент масиву: mas[" + minIn + "] = " + mas[minIn]);
            System.out.println("сума елементів після найменшого: " + sumMin);

            System.out.println("чи бажаєте ви прожовжити ?" );
            String esno = scan.next();
            if (esno.equalsIgnoreCase("так")){

            }
            else if ( esno.equalsIgnoreCase ("ні")) {
                break;
            }
            else {
                System.out.println("помилка");
                System.out.println("дайте відповідь так або ні" );
                esno = scan.next();
                if (esno.equalsIgnoreCase("так")){

                }
                else if ( esno.equalsIgnoreCase("ні")) {
                    break;
                }
            }
    }
}
}
