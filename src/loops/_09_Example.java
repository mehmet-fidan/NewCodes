package loops;

import java.util.Scanner;

public class _09_Example {
    public static void main(String[] args) {

        int num=5;

        for (int i = num; i>0; i--) {

            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i<=num; i++) {

                for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
