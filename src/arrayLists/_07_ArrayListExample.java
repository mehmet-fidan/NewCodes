package arrayLists;

import java.util.*;

public class _07_ArrayListExample {
     /*

    Setler, setlerde ayni elemandan bulunmaz
    HashSet       : kendine göre elemanları hizli olacagi bir algoritmaya göre kaydeder.
    LinkedHasSet  : giris sirasina göre kaydeder.
    TreeSet       : alfabetik veya numerik olarak siralar.
     */

    public static void main(String[] args) {
        HashSet<Integer> set1 =new HashSet<>();
        set1.add(1);
        set1.add(8);
        set1.add(12);
        set1.add(1234);
        set1.add(800);
        set1.add(56);
        set1.add(1);
        System.out.println(set1);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,8,12,1234,800,56,1));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println(set2);

        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList(1,8,12,1234,800,56,1));
        System.out.println(set3);
        System.out.println("---------------");
        System.out.println(list);
        Collections.swap(list,3,5);
        System.out.println(list);
    }
}
