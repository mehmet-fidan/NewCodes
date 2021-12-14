package methods;

import java.util.Arrays;
import java.util.Scanner;

public class _01_MethodsAndArray {
    public static void main(String[] args) {
        /*
        Ask the user to enter 10 number and put this number into an array and print them.
            */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 10 numbers");
        String nums = scanner.nextLine();

        String [] numsArray=nums.split(" ");
        int [] numsInt = new int[numsArray.length];

        //int max = Integer.MIN_VALUE;
        // int min =Integer.MAX_VALUE;


          for (int i=0; i<numsInt.length; i++) {
            numsInt[i]=Integer.parseInt(numsArray[i]);

          } System.out.println(Arrays.toString(numsInt));
    }
}
