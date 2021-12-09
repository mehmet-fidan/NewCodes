package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Arrays {
    public static void main(String[] args) {
          /* soru 2:
        Bir gazetede calisiyorunuz. Köse yazilarinin birinde 3. cümlenin sonunda "java"
        kelimesi eksik yazilmis. Bu hatayi düzeltecek bir program yazin.

        örnek köse yazisi su sekildedir:

        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in massa ac est finibus dictum.
                Pellentesque aliquam cursus risus, vitae elementum mi faucibus blandit. Nulla facilisi.
        Aenean molestie lacinia convallis. Morbi laoreet tellus purus, vel egestas turpis pretium in.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("paragrafı giriniz");
        String str = scanner.nextLine();

        String[] myStr = new String[str.length()];

        int cumleSayisi = 1;


        for (int i = 0; i < myStr.length; i++) {
            myStr[i] = String.valueOf(str.charAt(i));
            if (str.charAt(i) == '.') {
                cumleSayisi++;
            }

        } System.out.println("cumles sayisi = " + cumleSayisi);


        String ekleme= "java.";

        System.out.println();


        }

    }

