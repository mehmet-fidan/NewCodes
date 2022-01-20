package january.classExtends;

public class Dikdortgen extends Sekil{
    double uzunluk, genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    protected double alanHesapla() {
        return uzunluk*genislik;
    }

    @Override
    protected double cevreHesapla() {
        return 2*(uzunluk+genislik);
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                '}';
    }
}
