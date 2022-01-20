package january.classExtends2;

public class Calisan {


    int maas;
    String isim;
    double maasKatsayisi;

    public Calisan(int maas, String isim, double maasKatsayisi) {
        this.maas = maas;
        this.isim = isim;
        this.maasKatsayisi = maasKatsayisi;
    }
    public double maasHesapla() {
        return maas*maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Calisan " +
                "maas=" + maas +
                "isim= " + isim +
                "maasKatsayisi=" + maasKatsayisi;
    }
}

