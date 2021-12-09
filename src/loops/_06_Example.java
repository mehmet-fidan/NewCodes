package loops;

import java.util.Scanner;

public class _06_Example {
    public static void main(String[] args) {
        /*
        Question 6: Write a program that prompts the user to enter an integer
        and then returns the number with the numbers reversed. If Input: 12345 Output: 54321
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write down a 5 digit number");
        String number = scanner.nextLine();
        String reverse ="";

        for (int i =number.length()-1 ; i>=0 ; i--) {
            reverse+=number.charAt(i);
        }
        System.out.println(reverse);
 }
}
