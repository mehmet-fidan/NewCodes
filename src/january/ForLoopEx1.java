package january;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopEx1 {

    // Kullanıcıdan 10 adet sayı alın ve bunları Forloop ile bir array e atın
    // Daha sonra arraydeki tek ve çift öğeleri yazdırın.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int [] array = new int[10];
        int i;

        for (i = 0; i < array.length ; i++) {
          array[i] = scanner.nextInt();
            System.out.print(array[i]+", ");
        }

        int ciftToplam=0;
        int tekToplam = 0;

        for ( i = 0; i < array.length ; i++) {

            if (array[i]%2==0) {
                ciftToplam+=array[i];
            }
         } System.out.println("\ncift toplam :" +ciftToplam);

        for ( i = 0; i < array.length ; i++) {

            if (array[i]%2!=0) {
                tekToplam+=array[i];
            }
        } System.out.println("\ntek toplam :" +tekToplam);

    }

}
