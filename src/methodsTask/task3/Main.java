package methodsTask.task3;

public class Main {

    public static void main(String[] args) {

        Insan m1 = new Insan();
        m1.datenZuOrdnen("Ahmet", 33);

        Insan m2 = new Insan();
        m2.datenZuOrdnen("Hasan", 47);

        Insan m3 = new Insan();
        m3.datenZuOrdnen("Aliye", 45);

        m1.derVaterZuOrdnung(m2);
        m1.dieMutterZuOrdnung(m3);
        m3.dasKinZuOrdnung(m1);

        m1.werBistDu();
        m1.werIstDeinVater();
        m1.werIstDeineMutter();
        System.out.println("******");
        m3.werBistDu();
        m3.werIstDeinKind();

    }

}
