package arrays2D;

import java.util.Scanner;

public class _03R_Arrayd2D {
    public static void main(String[] args) {
         /*
        ogrencilerin vize ve final notlarini girebilecegi
        bir program yazin. kac ogrenci olacagini da alin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi girin");
        int ogrenciSayisi = scanner.nextInt();

        int[][] notlar = new int[ogrenciSayisi][2];
        // vize final notu girilecegi icin sÃ¼tun sayisi 2
        // ama kac ogrenci olacagini bilmedigimiz icin ogrSayisi dedik satir icin

        for (int i= 0; i< notlar.length; i++) {
            for (int j = 0; j < notlar[i].length ; j++) {
                if (j==0) {
                    System.out.println((i+1) +". Ogrenci " + " vize notu =");
                    notlar[i][j]= scanner.nextInt();
                } else {
                    System.out.println((i+1) +". Ogrenci " + " final notu =");
                    notlar[i][j]= scanner.nextInt();
                }
                System.out.println();
            }
        }
        for (int i=0; i< notlar.length ;i++) {
            for (int j=0 ;j< notlar[i].length ; j++) {
                System.out.print(notlar[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
