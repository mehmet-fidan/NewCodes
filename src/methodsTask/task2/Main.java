package methodsTask.task2;

public class Main {

    public static void main(String[] args) {
        Insan mensch1 = new Insan();
        mensch1.datenZuordnen("Ali", 21);
        mensch1.setzenDasVerhaltnis("Deli", "Veli", "Meli");

        Insan mensch2 = new Insan();
        mensch2.datenZuordnen("Ayse", 32);
        mensch2.setzenDasVerhaltnis("Halim","Selim");

        mensch1.sagDeinName();
        mensch1.sagDeinVerhaltnis();

        System.out.println("*****");

        mensch2.sagDeinName();
        mensch2.sagDeinVerhaltnis();


        dieMenschenAnzahl();

    }

    public static void dieMenschenAnzahl() {
        System.out.println(Insan.count++);
    }


}
