package january.classExtends;

public class Main {

    public static void main(String[] args) {

        Dikdortgen dik = new Dikdortgen(3,5);
        System.out.printf("Dikdortgen Cevresi : %.2f\n", dik.cevreHesapla());
        System.out.printf("Dikdortgen Alani : %.2f\n", dik.alanHesapla());

        System.out.println("--------");
        Kare kar = new Kare(7);
        System.out.printf("Karenin Cevresi : %.2f\n",kar.cevreHesapla());
        System.out.printf("Karenin Alani : %.2f\n", kar.alanHesapla());
        System.out.println("----------");

        Cember cem = new Cember(3);
        System.out.printf("Cemberin Cevresi : %.2f\n",cem.cevreHesapla());
        System.out.printf("Cemberin Alani : %.2f\n", cem.alanHesapla());
        System.out.println("--------");

        Daire dai = new Daire(4);
        System.out.printf("Dairenin Cevresi : %.2f\n", dai.cevreHesapla());
        System.out.printf("Dairenin Alani : %.2f\n", dai.alanHesapla());

    }

}
