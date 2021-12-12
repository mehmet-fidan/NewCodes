package methods;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Methods {
    public static void main(String[] args) {
        /*
        Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin
        ve sayilari bir metot ile diziye atin.
        Ayrıca  sayilardan bosluklu ve virgulle dizi olusturun.
         */

         sayilarlaVirguleGoreDiziOlusturma("21,35,45,56,98");
        sayilarlaBoslugaGoreDiziOlusturma("12,1,23,54,78");
        diziOlusturma();

    }
    public static void diziOlusturma() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin");
        String nums = scanner.nextLine();
        String[] numsDizi = nums.split(" ");
        int[] numsInt = new int[numsDizi.length];

        for (int i = 0; i < numsDizi.length; i++) {
           numsInt[i] = Integer.parseInt(numsDizi[i]);
        }
        System.out.println(Arrays.toString(numsInt));


    }

    public static void sayilarlaBoslugaGoreDiziOlusturma(String paraMetreWithNums) {

        String[] nums= paraMetreWithNums.split(" ");
        System.out.println(Arrays.toString(nums));
    }
    public static void sayilarlaVirguleGoreDiziOlusturma(String paraMetreWithNums2) {
        String [] nums2=paraMetreWithNums2.split(",");
        System.out.println(Arrays.toString(nums2));
    }




}
