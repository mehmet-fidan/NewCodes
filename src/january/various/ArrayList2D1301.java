package january.various;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D1301 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[][] array2 = {{1, 2}, {4, 5, 6}};

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(100, 200));

        list2.add(l1);
        list2.add(l2);
        list2.add(l3);

        System.out.println(list2);
        System.out.println("-----");

        for (ArrayList<Integer> list : list2) {
            for (Integer integer : list) {
                System.out.printf("%-6d", integer);
            }
            System.out.println();
        }
        System.out.println("-----");

        l2.forEach(n -> System.out.print(n + ", "));
        l2.forEach(n -> yaz(n));   // lambda yonteminde method kullanimi

        System.out.println("-----");

        l2.forEach(n -> {
            System.out.println(n + " : "); // lambda yontemi ile l2 array sout yaptik.
            for (int i = 0; i < n; i++) {  //lambda yontemi ile l2 for dongusune koyup
                System.out.print("*");  // her deger icin o kadar yildiz yazdik.
            }
            System.out.println();
        });

    }

    public static void yaz(int n) {
        System.out.println(n);
    }
}
