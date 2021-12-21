package arrays;

import java.util.Scanner;

public class _06_ArrayExample {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 Boyutlu 3*3 integer matris dizisini alın. Örneğin.-
        1 2 3
        4 5 6
        7 8 9
        Matrisin simetrik olup olmadığını kontrol edin. arr[i][j] == arr[j][i]
                 */
        Scanner scanner=new Scanner(System.in);
        int[][] dizi=new int[3][4];

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                int numbers =(int)(Math.random()*10);
                System.out.print(numbers+" ");
            }System.out.println();
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length ; j++) {
                if (dizi[i][j]==dizi[j][i]){
                    System.out.println("simetrik");
                } else {
                    System.out.println("simetrik degil");
                }
            }



        }
   }
}
