package loops;

import java.util.Scanner;

public class _14_ExampleLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("metin girin");
        String metin = scanner.nextLine();

        if (metin.contains("del")) {
            metin = metin.replace("del", "");

        }
        System.out.println(metin);


    }
}