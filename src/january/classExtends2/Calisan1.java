package january.classExtends2;

public class Calisan1 extends Calisan {

    public Calisan1(int maas, String isim, double maasKatsayisi) {
        super(maas, isim, maasKatsayisi);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla();
    }

    @Override
    public String toString() {
        return "Calisan Bilgileri =" +
                "\tMaas: " + maas +
                "\tIsim: " + isim +
                "\tMaas Kat Sayisi: " + maasKatsayisi;
    }
}
