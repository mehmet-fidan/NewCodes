package loops;

import java.util.Scanner;

public class _07_Example {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        int num= 5;

        for (int i=0 ; i<num;i++) {

        for ( int j=0; j< num; j++) {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
