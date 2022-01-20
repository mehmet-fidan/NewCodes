package january.classExtends2;

public class Main {

     /*
    bir Firma var. Firmanin calısanlari var.

   Calisan:
    isim;
    maas;
    maasKatsayisi;

    maasHesapla() --> maas + maasKatsayisi

   Mudur:
    isim;
    maas;
    maasKatsayisi;
    makamKatsayisi;


    maasHesapla() --> maas + maasKatsayisi + makamKatsayisi;


     */


    /*public static void main(String[] args) {

        Calisan1 c1 = new Calisan1("Ahmet", 1.2,2500);


        Mudur m1 = new Mudur("Veli", 1.5,1.4);

        System.out.println(m1);

     */
    public static void main(String[] args) {

        Calisan mudur = new Mudur(3500,"Hasan",1.5,1.2);
        System.out.printf( mudur+ "\n" + "Net Maas: %.2f\n",mudur.maasHesapla());

        System.out.println("------");

        Calisan calisan = new Calisan1(2500,"Ali",1.3);
        System.out.printf(calisan + "\n" +"Net Maas: %.2f\n", calisan.maasHesapla());
    }

}
