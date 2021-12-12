package loops;

import java.util.Scanner;

public class _08_Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      System.out.println("please enter a number");
        int num= scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

            }
         }
     }

