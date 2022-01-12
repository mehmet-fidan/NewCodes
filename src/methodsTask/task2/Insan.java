package methodsTask.task2;

import java.util.ArrayList;

public class Insan {

    static int count;
    String derName;
    int dasAlter;

    ArrayList<String> dasVerhaltnis = new ArrayList<>();

    public void datenZuordnen (String derName, int dasAlter) {
        this.derName = derName;
        this.dasAlter = dasAlter;
        count++;

    }
    public void setzenDasVerhaltnis (String... dieVerhaltnisName) {

       /* for (int i = 0; i < dieVerhaltnisName.length ; i++) {
            dasVerhaltnis.add(dieVerhaltnis[i]);
        }
                */

        for (String s:dieVerhaltnisName ) {
            dasVerhaltnis.add(s);

        }
    }

    public void sagDeinName() {
        System.out.println("Mein Name ist= " + derName);
            }
            public void sagDeinVerhaltnis() {
                System.out.println("Mein Verhaltnis sind = "+dasVerhaltnis);
            }

}
