package january.abstractsEx1;

public abstract class Salad extends Food{

    public Salad(String name) {
        super(name);
    }

    @Override
    public void taste() {
        System.out.println("dogal beslenme");
    }
}
