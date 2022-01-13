package january;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList1301 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //Math.random()   [0,1)

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));

        }
        System.out.println(list);

        //liste hem 2 hem de 3 e bölünen sayilari siler.
        list.removeIf(
                n -> n % 2 == 0 && n % 3 == 0);

        System.out.println(list);
    }
}
