package january.methods;

import java.util.Arrays;

public class MethodEx1 {

   /*
    int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane rakam oldugunu return eden  methodu yazdiriniz
    --> kac tane tek sayi oldugunu return eden methodu yazdiriniz
    --> kac tane cift sayi oldugunu return eden methodu yazdiriniz
    -->en buyuk sayi
    -->en kucuk sayi
        */

    public static void main(String[] args) {
        int array[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        System.out.println("Toplam RakamSayisi: " + rakamSayisi(array));

        System.out.println("Tek Sayilarin Adedi :" + tekSayiBul(array));
        System.out.println("Cift Sayilarin Adedi :" +ciftSayiBul(array));
        System.out.println("En Buyuk Sayi: " +maxBul(array));
        System.out.println("En Kucuk Sayi: " +minBul(array));

    }

    public static int rakamSayisi(int[][] array) {

        int count = 0;
        String str = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                str = String.valueOf(array[i][j]);
                count += str.length();
            }
        }

        return count;
    }

    public static int tekSayiBul(int[][] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int ciftSayiBul(int[][] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int maxBul(int[][] array) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;

    }

    public static int minBul(int[][] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;

    }
}
