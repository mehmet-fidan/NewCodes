package january.abstractsEx1;

public class Baklava extends Sweet {

    public Baklava(String name) {
        super(name);
    }

    @Override
    public void madeIn() {
        System.out.println("Turkey");
    }
}
