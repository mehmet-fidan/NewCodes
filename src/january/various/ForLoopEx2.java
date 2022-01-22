package january.various;

import java.util.Arrays;

public class ForLoopEx2 {

    /*
    İnt array oluşturunuz ve eleman sayısı 5 olsun.
    Elemanlar random atansın. (10 a kadar - 10 dahil)
    Array'i yazdırınız.     array = [......]
    Daha sonra Array'daki maximum değeri bulunuz ve yazdırınız
         */

    public static void main(String[] args) {
        int [] array = new int[5];

        int max=0;

        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random()*10+1);
           if (array[i]>max) {
               max =array[i];
           }
         }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }
}
