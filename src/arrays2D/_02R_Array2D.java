package arrays2D;

import java.util.Scanner;

public class _02R_Array2D {
    public static void main(String[] args) {
           /*
        euro ve dolar in son 6 ayda ki karsiliklarini bir tabloya ekleyin.
        Bu tabloyu ekrana yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        int[][]  exchange = new int[6][2];


        for (int i = 0; i < exchange.length ; i++) {
            for (int j = 0; j < exchange[i].length; j++) {
                if (j==0) {
                    System.out.println("dolar kuru");
                    exchange[i][j]= scanner.nextInt();

                } else if (j==1) {
                    System.out.println("euru kuru");
                    exchange[i][j]= scanner.nextInt();
                }
            }
        }

        System.out.println("Dolar Kuru"+"; "+" Euro Kuru");

        for (int i = 0; i < exchange.length; i++) {
            for (int j = 0; j < exchange [i].length; j++) {
                System.out.print(exchange[i][j]+ "     ;       ");
            }
            System.out.println();
        }
    }
}
