package loops;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        /*
        Question 3: Write a program that prompts the user to enter a positive integer.
        It should then print the multiplication table of that number.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a positiv number");
        int num = scanner.nextInt();
        int sum= 0;

        for (int i=1 ; i<=10 ; i++ ) {
            sum =i*num;
             System.out.println(num + " X " +i+" = " +sum );
             }
  }
}
