package loops;

import java.util.Scanner;

public class _04_Example {
    public static void main(String[] args) {
        /*
        Question 4: Write a program that finds the factorial value of any number entered from the keyboard.
        The factorial of a number is the product of the numbers from 1 to that number.
        Input: 5 and Output: 1*2*3*4*5 = 120
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please write down a number");
        int number = scanner.nextInt();
        double factorialValue =1;

        for (int i=1;i<=number ; i++ ) {
            factorialValue*=i;
            System.out.print(i + " * ");
        }
        System.out.println("Factorial Value Equals =" +factorialValue);
  }
}
