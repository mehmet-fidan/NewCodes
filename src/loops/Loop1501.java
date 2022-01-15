package loops;

public class Loop1501 {
    public static void main(String[] args) {

            for (int i = 0; i < 11; i+=2) {
                for (int j =10; j >=i ; j--) {
                    System.out.print("*");

                }
                System.out.println();

            }
    }
}
