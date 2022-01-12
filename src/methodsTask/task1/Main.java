package methodsTask.task1;

public class Main {

    public static void main(String[] args) {
        Kitap buch1 = new Kitap();
        buch1.name = "Schachnovelle";
        buch1.publicationDate = 1942;
        buch1.pageNumber = 72;

        Kitap buch2 = new Kitap();
        buch2.name = "Vorleser";
        buch2.publicationDate = 1986;
        buch2.pageNumber = 183;

        buch1.writeInfo();
        buch2.writeInfo();

        System.out.println("*******");
        buchAngabe(buch1);
        buchAngabe(buch2);

    }

    public static void buchAngabe(Kitap buch) {
        System.out.println("Der Name des Buches= " + buch.name);
        System.out.println("Die Anzahl der Seiten= " + buch.pageNumber);

    }
}
