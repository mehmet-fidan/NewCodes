package arrays;

import java.util.Scanner;

public class _04_Arrays {
    public static void main(String[] args) {

      /*
        kullanicidan bir cumle yazmasini isteyin.
        bu cumledeki harfleri kelime kelime bir diziye atin
        cumleyi tersten yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("cumle girin");
        String cumle = scanner.nextLine();

        //String [] kelimeler = new String[cumle.length()];

        String[] kelimeler = cumle.split(" ");

        for (int i = kelimeler.length - 1; i >= 0; i--) {

            System.out.print(kelimeler[i] + " ");

        }
    }
}





