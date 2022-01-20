package january.classExtends2;

public class Mudur extends Calisan {


    double makamKatsayisi;

    public Mudur(int maas, String isim, double maasKatsayisi, double makamKatsayisi) {
        super(maas, isim, maasKatsayisi);
        this.makamKatsayisi = makamKatsayisi;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()*makamKatsayisi;
    }

    @Override
    public String toString() {
        return   "Mudur Bilgileri = "+
                "\tMaas: " + maas +
                "\tIsim: " + isim +
                "\tMaas Kat Sayisi: " + maasKatsayisi +
                "\tMakam Kat Sayisi: " + makamKatsayisi ;
    }
}
