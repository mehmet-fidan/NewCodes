package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_ArrayListExample {
    public static void main(String[] args) {
        /*
        kullanicidan 10 tane  sayi girmesini isteyin. Bu sayilarin
        cift sayi olanlari bir dizi icierine atin. ciftSayilar() diye bir metot olusturun.

         */

        Scanner scanner=new Scanner(System.in);
        int [] nums =new int[10];

        for (int i = 0; i <nums.length ; i++) {
            System.out.println("please enter 10 numbers");
            nums[i]= scanner.nextInt();
        }

        System.out.println("The Even Numbers = "+isEven(nums));
        System.out.println("The Odd Numbers = "+isOdd(nums));

    }
    public static ArrayList<Integer> isEven(int [] numbers ) {
        ArrayList<Integer> evenNums=new ArrayList<>();

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]%2==0) {
            evenNums.add(numbers[i]);
            }
        }
        return evenNums;
    }
    public static ArrayList<Integer> isOdd(int[] numbers){
        ArrayList<Integer> oddNums=new ArrayList<>();
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]%2!=0)
            oddNums.add(numbers[i] );
        }
        return oddNums;
    }

}
