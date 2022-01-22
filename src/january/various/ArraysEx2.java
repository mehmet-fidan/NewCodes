package january.various;

import java.util.Arrays;

public class ArraysEx2 {

    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,6};
        int[] a2={1,2,3,4,5,7};


        // Çıktı?
        if (Arrays.equals(a1, a2)){
            System.out.println("Equals");
        }
        else {
            System.out.println("Not equals");
        }

        System.out.println("------");

        String[] c = new String[] { "false", "true", "false" };
        String [] d = new String[] { "false", "true", "false" };

        if (Arrays.equals(c, d)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        String str1 = "kelime";
        String str2 = "KeliMem";

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }


    }
}
