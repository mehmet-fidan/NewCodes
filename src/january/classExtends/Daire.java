package january.classExtends;

public class Daire extends Cember{

    public Daire(double yariCap) {
        super(yariCap);
    }

    @Override
    protected double alanHesapla() {
        return PI*yariCap*yariCap; //super.yariCap == yariCap, bu class"da yaricap olmadigi icin.
    }

    @Override
    protected double cevreHesapla() {
        return super.cevreHesapla();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
