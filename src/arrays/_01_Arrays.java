package arrays;

import java.util.Scanner;

public class _01_Arrays {
    public static void main(String[] args) {

        /*
        ask the user to enter 5 numbers and print out these numbers.
         */

        Scanner scanner = new Scanner(System.in);

        int [] nums= new int[5];

        for (int i = 0; i <nums.length; i++) {
            System.out.println("enter number");
            nums [i]= scanner.nextInt();
        }

        for (int i = 0; i < nums.length ; i++) {

            System.out.print(nums[i] + " " );
        }

    }
}
