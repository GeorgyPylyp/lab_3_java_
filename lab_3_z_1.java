import java.util.Scanner;

public class lab_3_z_1 {


    public static void main(String[] args) {
        while (true) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть n:");
        int n = scan.nextInt();

        int[] mas = new int[n];
        for(int i=0; i<mas.length; i++){
            System.out.println("введіть елемент масиву №"+i);
            int elem = scan.nextInt();
            mas[i]=elem;

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

