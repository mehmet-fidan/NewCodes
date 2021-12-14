package methods;

import java.util.Scanner;

public class _06_MethosExample {
    public static void main(String[] args) {

     /*  Aşağıdaki gibi bir menü çıkartarak kullanicidan sürekli değişkenleri alınız ve
        her bir menü elemanını değer alan bir fonksiyon yazınız.
        1-toplama
        2-çıkarma
        3-çarpma
        4-bolme
        5-Faktöryel
        6-Çıkış
        Bir işlem seçiniz
               */

       Scanner scanner=new Scanner(System.in);
        int secim;
        do {
            menuYaz();
            System.out.println("islem secin");
            secim= scanner.nextInt();
            islemYap(secim);
        } while (secim<6);

    }
    public static void menuYaz() {

        System.out.println("*****Menu*****");
        System.out.println("1. Toplama");
        System.out.println("2. Cikarma");
        System.out.println("3. Bolme");
        System.out.println("4. Carpma");
        System.out.println("5. Faktoryel");
        System.out.println("6. Sistemden Cik");
    }

    public static void islemYap(int islem) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        switch (islem) {

            case 1:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                toplam(num1,num2);
                break;
            case 2:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                cikarma(num1,num2);
                break;
            case 3:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                bolme(num1,num2);
                break;
            case 4:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                System.out.println("2. sayiyi girin");
                num2 = scanner.nextInt();
                carpma(num1,num2);
                break;
            case 5:
                System.out.println("1. sayiyi girin");
                num1 = scanner.nextInt();
                faktoryel(num1);
                break;
        }
    }
    public static void toplam(int num1, int num2) {
        System.out.println("topla = "+(num1+num2));
    }
    public static void cikarma(int num1, int num2) {
        System.out.println("cikarma ="+(num1-num2));
    }
    public static void bolme(int num1,int num2) {
        System.out.println("bome ="+(num1/num2));
    }
    public static void carpma(int num1, int num2) {
        System.out.println("carpma ="+(num1*num2));
    }
    public static void faktoryel(int num1) {

        double faktoryel=1;
        for (int i = 1; i <=num1 ; i++) {
            faktoryel*=i;
        }
        System.out.println("faktoryel ="+faktoryel);

    }
}
