package methods;

import java.util.Arrays;
import java.util.Scanner;

public class _04_MethodsAndArray {
    public static void main(String[] args) {
       /* Kullanıcıdan 10 tamsayı alın ve bunları bir dizide saklayın. Şimdi, tüm öğeleri başka bir diziye ters sırada
        kopyalayın.
                */
        Scanner scanner=new Scanner(System.in);
        int [] nums=new int[10];

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=(int) (Math.random()*10);
            System.out.print(nums[i]+ " ");

        }
        System.out.println(Arrays.toString(nums));

        int [] numsInt =new int[nums.length];

        for (int i = numsInt.length-1; i>=0 ; i--) {
           numsInt[i]=nums[i];
            System.out.print(numsInt[i]+ " ");
        }
        System.out.println(Arrays.toString(nums));
        }
   }

