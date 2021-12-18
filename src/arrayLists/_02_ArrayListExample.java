package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _02_ArrayListExample {
    public static void main(String[] args) {
        /*
        kullanicidan bir cumle girmesini isteyin. bu cumleyi tersten yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a statement");
        String text= scanner.nextLine();
        String [] text2=text.split("");

       ArrayList<String> text4=reversePrint(text2);
        reverseWriting(text4);

        }
    public static ArrayList<String> reversePrint(String[] text3 ) {
           ArrayList<String> reverseText = new ArrayList<>();
           for (int i = 0; i < text3.length; i++) {
               reverseText.add(text3[i]);
           }
           Collections.reverse(reverseText);
         return reverseText;
       }
       public static void reverseWriting (ArrayList<String> list) {

           for (int i = 0; i < list.size() ; i++) {
               System.out.print(list.get(i));

           }

       }
  }
