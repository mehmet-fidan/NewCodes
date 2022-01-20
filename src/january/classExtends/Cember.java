package january.classExtends;

public class Cember extends Sekil {


    protected double yariCap;
    // public final double PI = Math.PI; // instance olarak tanimlanmistir. herbir nesne icin ayri ayri create edilir.
    public static final double PI = Math.PI; //statik tanimlanirsa bie defa create edilir ve tüm nesneler ulasilabilir.

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    protected double alanHesapla() {
        try {
            super.alanHesapla();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }return 0;
    }

    @Override
    protected double cevreHesapla() {
        return 2*PI*yariCap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + yariCap +
                '}';
    }
}
