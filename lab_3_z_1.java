import java.util.Scanner;

public class lab_3_z_1 {


    public static void main(String[] args) {
        while (true) {
        Scanner scan = new Scanner(System.in);
        int n;
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

        int[] mas = new int[n];
        for(int i=0; i<mas.length; i++){
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
        int min=0;
        int m=0;

        int suma=0;
        int s=0;
        for(int i=0; i<mas.length; i++){

            if(i<n){
                suma += mas[i];
                s++;

            }


        }
        float sered = (float) suma / n;
        System.out.println("середнє арифметичне="+sered);
        System.out.println("сума="+suma);



        for(int i=0; i<mas.length; i++){
            if(mas[i]< 0){
                min += mas[i];
                m++;
            }
            if(sered<m){
                mas[i] *= 10;
                System.out.println("елемент масиву №"+i +" "+mas[i]);
            }
            if(sered>m){
                mas[i] *= 0;
                System.out.println("елемент масиву №"+i +" "+mas[i]);
            }
        }
        System.out.println("кількість від'ємних елементів="+m);

            System.out.println("чи бажаєте ви прожовжити ?" );
            String esno = scan.next();
            if (esno.equalsIgnoreCase("так")){

            }
            else if ( esno.equalsIgnoreCase ("ні")) {
                break;
            }
            else {
                System.out.println(" помилка");
                System.out.println("дайте відповідь так або ні" );
                 esno = scan.next();
                if (esno.equalsIgnoreCase("так")){

                }
                else if ( esno.equalsIgnoreCase ("ні")) {
                    break;
                }
            }

        }

    }
}

