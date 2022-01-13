package methodsTask.task3;

public class Insan {

    static int count;
    String derName;
    int dasAlter;
    Insan derVater;
    Insan dieMutter;
    Insan dasKind;

    public void datenZuOrdnen(String derName, int dasAlter) {
        this.derName = derName;
        this.dasAlter = dasAlter;
        count++;
    }

    public void derVaterZuOrdnung(Insan dieMensch) {
        derVater = dieMensch;
    }

    public void dieMutterZuOrdnung(Insan dieMensch) {
        dieMutter = dieMensch;
    }
    public void dasKinZuOrdnung (Insan dieMensch) {
        dasKind = dieMensch;
    }

    public void werBistDu() {
        System.out.println("Mein Name ist " + derName+" Ich bin "+dasAlter+" alt");
    }
    public void werIstDeinVater () {
        System.out.println("Mein Vater heisst "+derVater.derName+" er ist "+derVater.dasAlter+ " alt");
    }
    public void werIstDeineMutter () {
        System.out.println("Meine Mutter heisst "+dieMutter.derName+" sie ist "+dieMutter.dasAlter+ " alt");
    }
    public void werIstDeinKind () {
        System.out.println("Mein Kind heisst "+dasKind.derName + " Er ist "+ dasKind.dasAlter+ " alt");
    }

}
