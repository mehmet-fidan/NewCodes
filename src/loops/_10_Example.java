package loops;

public class _10_Example {
    public static void main(String[] args) {
        
        int num= 5;

        for (int i = 0; i <num ; i++) {
            for (int j = 0; j < num-1-i ; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        
    }
}
