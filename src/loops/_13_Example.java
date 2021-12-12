package loops;

public class _13_Example {
    public static void main(String[] args) {

        int num = 5;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i-j+1);
            }
            System.out.println();
        }

    }
}
