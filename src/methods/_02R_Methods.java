package methods;

import java.util.Arrays;
import java.util.Scanner;

public class _02R_Methods {
    public static void main(String[] args) {
         /*Kullanicidan aralarinda bir bosluk birakarak 5 tam sayi girmesini isteyin
        ve sayilari bir metot ile diziye atin.

        Bu sayilardan en buyuk ve en kucuk olanlari bulan iki farkli metot yazin.

                */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers with one space");
        String arrayNumbers = scanner.nextLine();
        String[] numbers = arrayNumbers.split(" ");
        int[] numbersInteger = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersInteger[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println(Arrays.toString(numbersInteger));

        enbArray(numbersInteger);
        enkArray(numbersInteger);

    }

    public static void enbArray(int [] nums) {
        Arrays.sort(nums);
        System.out.println("en buyuk = "+nums[0]);

    }
    public static void enkArray (int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("en kucuk = "+dizi[dizi.length-1]);
    }

}

