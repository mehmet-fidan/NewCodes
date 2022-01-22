package january.various;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx3 {

    /*
    int array oluşturun.
    Sistem size "Kaç elemanlı bir Array oluşturmak istiyorsunuz ? (!!Tek sayı olmalı !! :  )  " şeklinde bir soru sorsun.
    Array'in kaç elemandan oluşacagına kullanıcı karar versin. (3,5,7)
    ve bu elemanları kullanıcıdan alın. (Scanner)     (1. sayıyı giriniz  ... .... )
    Array'in içindeki elemanları küçükten büyüğe sıralayın .(method kullanın)
    ve            'ortadaki'              elemanı bulması için bir program yazın.
         */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kac elemanli(eleman sayisi tek olmali) bir array olusturmak istiyorsunuz");
        int elemanSayisi = sc.nextInt();
        int [] array=new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.println("sayi girinizi");
            int sayi= sc.nextInt();
            array[i] +=sayi;

        }System.out.println("Elemanlar :" + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Kucukten Buyuge : " +Arrays.toString(array));

        String ortaEleman;

        for (int i = 0; i < array.length ; i++) {
            if (i==array.length/2) {
                ortaEleman = String.valueOf(array[i]);
                System.out.println("Orta eleman : " +ortaEleman );
            }

        }
    }
}
