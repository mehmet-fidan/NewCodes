package arrays;

import java.util.Scanner;

public class _02_Arrays {
    public static void main(String[] args) {
       /* soru1:
        Bir okulda ögretmensiniz. Sinifa 5 yeni ögrenci kaydi yapacaksiniz.
        Ögrencilerin isim ve soyisimlerini kaydedecek bir program yazmaniz istendi.
                Bu ögrencilere seviye belirleme sinavi yaptiniz.
                Aldiklari sonuclar su sekildedir: 80,85,90,96,100
        Bu bilgilere gore ogrencilerin isim soyisim ve notlarini ekrana yazdirin.
        örnek cikti su sekilde olacak:

        ögrenci abdullah sinavdan 80 almistir.
                ögrenci cihat sinavdan 85 almistir.
                ögrenci fatma sinavdan 90 almistir.
                ögrenci harun sinavdan 96 almistir.
                ögrenci yasin sinavdan 100 almistir.
                      */
        Scanner scanner= new Scanner(System.in);
        String [] adSoyad = new String[5];
        int []    puan = new int[5];

        for (int i = 0; i < adSoyad.length ; i++) {
            System.out.println("Ad ve Soyad Girin");
            adSoyad[i] = scanner.nextLine();
        }


        for (int i = 0; i < puan.length ; i++) {
            System.out.println("puani giriniz");
            puan[i]= scanner.nextInt();
        }

        for (int i = 0; i < adSoyad.length; i++) {
            System.out.println("Ogrenci : "+adSoyad[i] +" Sinavdan " + puan [i]+ " almistir.");

        }

    }
}
