package methodsTask.task1;

public class Kitap {

    String name;
    int pageNumber;
    int publicationDate;

    public void writeInfo () {
        System.out.println("Der Name des Buches ist: " +name+
                "\ndie anzahl der seiten sind: " +pageNumber +
                "\ndie Veröffentlichungsdatum ist: "+ publicationDate);
    }

}
