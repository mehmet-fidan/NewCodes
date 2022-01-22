package january;

public class ArraysEx1 {
    public static void main(String[] args) {
      /*
        5-5 lik bir tabloyu 0-10 arasi sayilarla doldurup yazdirin.
         */

        int[][] numbers = new int[5][5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = ((int) (Math.random() * 10));
                System.out.print(numbers[i][j]+", ");

            }
            System.out.println();

        }

        System.out.println("---------");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+", ");
            }
            System.out.println();

        }

    }
}
