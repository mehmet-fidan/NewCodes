package methods;

import java.util.Arrays;
import java.util.TreeSet;

public class _07_MethodsExample {
    public static void main(String[] args) {


        String metin="abcdeaabbbddcccceff";


        duzenli(metin);

    }
    public static void duzenli(String str) {

        String [] array =str.split("");
        TreeSet<String> harfler=new TreeSet<>(Arrays.asList(array));

        String yeni="";
        for (String harf:harfler) {
            yeni+=count(str,harf)+harf;

        }
        System.out.println(yeni);

    }
    public static int count(String str,String harf) {
        String s;

        int miktar=0;

        for (int i = 0; i <str.length() ; i++) {
            s=String.valueOf(str.charAt(i));
            if (harf.equals(s))
                miktar++;
        }
        return miktar;

    }
}
