package methods;

public class _01R_Methods {
    public static void main(String[] args) {
         /*
        {{"15$","56â‚¬","33$"},{"67$","78â‚¬"},{"100â‚¬"}}
        bu sekilde bir fiyat tablonuz var. dolar olanlari 3 ile,
        euro olan fiyatlari 5 ile carpip toplam fiyati bulun.
         */

        String[][] fiyatlar =  {{"15$","56£","33$"},{"67$","78£"},{"100£"}};
        // toplamda 3 satir var 1. satirda 3 sÃ¼tun
        // 2. satirda 2 sÃ¼tun. 3. satirda 1 sÃ¼tun

        int toplam = 0; // toplam degiskeni disarida oldugu icin if else icerisindeki islemlerin toplam sonucunu alir
        String fiyat = "";

        for (int i = 0; i < fiyatlar.length; i++) {
            for (int j = 0; j < fiyatlar[i].length; j++) {

                if (fiyatlar[i][j].contains("$")){
                    fiyat=fiyatlar[i][j].replaceAll("\\$","");
                    toplam+=Integer.parseInt(fiyat)*3;
                }else {
                    fiyat=fiyatlar[i][j].replaceAll("£","");
                    toplam+=Integer.parseInt(fiyat)*5;
                }
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
