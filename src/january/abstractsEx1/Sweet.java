package january.abstractsEx1;

public abstract class Sweet extends Food {

    public Sweet(String name) {
        super(name);
    }

    @Override
    public void taste() {
        System.out.println("Tatli");
    }
}
