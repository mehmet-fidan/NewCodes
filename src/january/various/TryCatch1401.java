package january.various;

import java.util.Scanner;

public class TryCatch1401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cumle girin : ");
        String cumle = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(cumle);
        // stringBuilder.append(cumle);
        System.out.print("kelime girin : ");
        String kelime = scanner.nextLine();

        int index;
        try {
            System.out.print("Index girin : ");
            index = scanner.nextInt();
        } catch (Exception e) {
            index =0;
        }

        try {
            stringBuilder.insert(index, kelime);
        } catch (Exception e) {
            System.out.println("Index hatasi. Ekleme yapilmadi");
        }
        System.out.println(stringBuilder);

    }
    }

