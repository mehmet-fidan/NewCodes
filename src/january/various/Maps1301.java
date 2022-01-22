package january.various;

import java.util.HashMap;
import java.util.Map;

public class Maps1301 {
    public static void main(String[] args) {
        /*
        Map     (key, value)
        key    : unique

        HashMap
        LinkedHashMap
        TreeMap
         */
        HashMap<Integer, String> map1 = new HashMap<>(Map.of(1,"a",2,"b"));
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(null,"bos1");
        map2.put(1,"Java");
        map2.put(2,"C#");
        map2.put(3,"Python");
        map2.put(4,"JavaScript");

        map2.put(null,"bos");
        System.out.println(map1);
        System.out.println(".....");
        System.out.println(map2);

        System.out.println("------");

        for (Map.Entry<Integer, String> e :map2.entrySet()) {
            System.out.println(e.getKey()+", "+e.getValue());
        }
        System.out.println("*****");

        map2.forEach((k,v)-> System.out.println(k+ ", "+v));

    }
}
