package january.abstractsEx1;

public class Main {

    public static void main(String[] args) {

        Food baklava = new Baklava("baklava");
        Food cake = new CheeseCake("Cheese Cake");
        Food sezarSalad = new SezarSalad("sezar Salad");
        Food greekSalad = new GreekSalad("Greek Salad");

        bilgiYaz(baklava);
        bilgiYaz(cake);
        bilgiYaz(greekSalad);
        bilgiYaz(sezarSalad);

        baklavaBilgiYaz((SezarSalad) sezarSalad);
    }
    public static void baklavaBilgiYaz(SezarSalad sezarSalad) {
        System.out.println(sezarSalad.getName());
    }

    public static void bilgiYaz(Food food){
        System.out.println(food.getName());
        food.taste();
        food.madeIn();

        // Parent ismi ile gelen nesnelerin hangi class"in nesnesi oldugunu anlamak icin
        // instanceof (nesne) kullanilir.

        System.out.println(food instanceof  Salad);
        System.out.println(food instanceof Baklava);
        System.out.println("-------------------");
        if (food instanceof Baklava)
            System.out.println(((Baklava) food).getName());

    }
}
