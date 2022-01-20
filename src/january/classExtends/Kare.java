package january.classExtends;

public class Kare extends Dikdortgen {

    public Kare(double uzunluk) {
        super(uzunluk, uzunluk);
    }

    @Override
    public String toString() {
        return "Kare{" +
                "uzunluk=" + uzunluk +
                '}';
    }
}
