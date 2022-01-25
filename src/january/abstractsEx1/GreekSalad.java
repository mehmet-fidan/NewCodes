package january.abstractsEx1;

public class GreekSalad extends Salad {

    public GreekSalad(String name) {
        super( name);
    }

    @Override
    public void madeIn() {
        System.out.println("Greek");
    }
}
