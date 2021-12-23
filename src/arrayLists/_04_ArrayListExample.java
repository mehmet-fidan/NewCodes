package arrayLists;

import java.util.ArrayList;

public class _04_ArrayListExample {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> notlarTablosu = new ArrayList<>();
        //Listin listi denir. herbir indekste bir liste tutar.

        String[] dersler = new String[3];
        dersler[0] = "Matematik";
        dersler[1] = "Almanca";
        dersler[2] = "Fizik";

        ArrayList<Integer> matNotlar = new ArrayList<>(); //tek boyutlu bir liste
        matNotlar.add(95);
        matNotlar.add(85);
        matNotlar.add(75);

        ArrayList<Integer> almancaNotlar = new ArrayList<>(); //tek boyutlu bir liste
        almancaNotlar.add(65);
        almancaNotlar.add(85);
        almancaNotlar.add(82);

        ArrayList<Integer> fizikNotlar = new ArrayList<>();//tek boyutlu bir liste
        fizikNotlar.add(76);
        fizikNotlar.add(84);
        fizikNotlar.add(75);

        notlarTablosu.add(matNotlar);
        notlarTablosu.add(almancaNotlar);
        notlarTablosu.add(fizikNotlar);


        for (int i = 0; i < matNotlar.size(); i++) {
            System.out.println(matNotlar.get(i) + " ");

        }
        System.out.println("*************");

        for (int i = 0; i < notlarTablosu.size(); i++) {
            System.out.println(dersler[i]);
            for (int j = 0; j < notlarTablosu.get(i).size(); j++) {
                System.out.println((i + 1) + ". Satidaki " + (j + 1) + ". not =" + notlarTablosu.get(i).get(j));

            }
        }
    }
}