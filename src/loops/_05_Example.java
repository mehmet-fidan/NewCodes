package loops;

import java.util.Locale;
import java.util.Scanner;

public class _05_Example {
    public static void main(String[] args) {
        /*
        Question 5: Write a program that prompts the user to enter a text
        and prints it in reverse.   If Input : Java    Output: avaJ
                 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text");
        String text = scanner.nextLine();
        String strRev ="";

        for (int i=text.length()-1 ; i>=0; i-- ) {
            strRev+=text.charAt(i);

        } System.out.print(strRev);
  }
}
