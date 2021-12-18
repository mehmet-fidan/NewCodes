package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_ArrayExample {
    public static void main(String[] args) {
        /*
        Bir dizinin en büyük ve en küçük öğelerini bulun.
         */
        int[] array={-5,2,3,7,4,5,12,25,36,84};

            int max=array[0];
           int min=array[0];

        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max) {
                max=array[i];
            }
            if (array[i]<min) {
                min=array[i];
            }

        } System.out.println("en buyuk sayi= "+max);
        System.out.println("en kucuk sayi= "+min);

       /* for (int i = 0; i < array.length ; i++) {
            array[i]=(int) (Math.random()*10);
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
                */

    }
}
