package methods;

import java.util.Scanner;

public class _03_MethodsAndArray {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 20 tamsayı girişi alın ve aşağıdakileri yazdırın:
         pozitif sayıların sayısı ; negatif sayıların sayısı ; tek sayıların sayısı
          çift sayıların sayısı ; 0 (sıfır) sayısı.
           */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter numbers");
        int [] nums = new int[20];


        int pozitifAdet = 0;
        int negatifAdet=0;
        int tekSayiAdet=0;
        int ciftSayiAdet=0;
        int sifir=0;

        for (int i = 0; i <nums.length ; i++) {

            nums[i]= scanner.nextInt();
            if (nums[i] > 0) {
                pozitifAdet++;
            } else if (nums[i] < 0) {
                negatifAdet++;
            } else {
                sifir++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0) {
                ciftSayiAdet++;
            } else {
                tekSayiAdet++;
            }

        } System.out.println(pozitifAdet+ "; "+negatifAdet+";"+ciftSayiAdet+"; "+ tekSayiAdet+"; "+sifir);

    }


}
