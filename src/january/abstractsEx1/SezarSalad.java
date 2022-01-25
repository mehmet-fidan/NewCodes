package january.abstractsEx1;

public class SezarSalad extends Salad {

    public SezarSalad(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("Italy");
    }
}
