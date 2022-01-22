package january;

import java.util.Scanner;

public class BooleanEx1 {
    // bir metot yaziniz. bu metot kullanicidan alacagi sayinin asal sayi olup olmadigini
    //kontrol etsin. eger kullanici 1 sayisini girerse  1 den buyuk bir sayi giriniz uyarisini versin
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tane sayi giriniz");
        int sayi = scanner.nextInt();

        boolean sonuc = asalMi(sayi);

        if (sonuc == true) {
            System.out.println("Sayi asaldir");
        } else {
            System.out.println("Sayi asal degildir.");
        }

    }

    static boolean asalMi(int sayi) {

        if (sayi <= 1) {
            System.out.println("Lütfen 1' den büyük bir sayi giriniz");
            return false;
        }
        boolean durum = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                durum = false;
                break;
            } else {
                durum = true;
            }
        }
        return durum;
    }
}
