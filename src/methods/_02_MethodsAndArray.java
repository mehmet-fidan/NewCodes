package methods;

import java.util.Arrays;
import java.util.Scanner;

public class _02_MethodsAndArray {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 10 tamsayı girisi alın ve bunlari bir dizide saklayin.
         Yine kullanicidan bir sayi vermesini isteyin. Şimdi kullaniciya
         bu sayinin dizide olup olmadığını söyleyin.
         */
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("please enter the numbers");
            nums[i] = scanner.nextInt();

        }
        System.out.println();

        System.out.println("enter a number");
        int num = scanner.nextInt();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]== num) {
                System.out.println("included");
                break;
            } else {
                System.out.println("no");
            }

        }
    }
}






