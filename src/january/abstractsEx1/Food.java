package january.abstractsEx1;

public abstract class Food {

    private String name;

    public Food(String name) {
        this.name = name;
    }

    public abstract void madeIn();
    public abstract void taste();

    public String getName() {
        return name;
    }
}

