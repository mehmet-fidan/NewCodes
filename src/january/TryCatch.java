package january;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            int a = scan.nextInt();   //hata cikabilir
            System.out.println("Girilen Ilk Sayi : " + a);
            int b = scan.nextInt();
            System.out.println("Girilen Ikinci Sayi : " + b);
            System.out.println("Ilk Sayinin Karesi : " + karesi(a));
            System.out.println("Ikinci Sayinin Karesi : " + karesi( b));

        } catch (Exception e) {
            System.out.println("Integer girmelisiniz");
        }

    }
    public static int karesi (int i) {
        return i*i;
    }

}
