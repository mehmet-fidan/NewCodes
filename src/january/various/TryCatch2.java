package january.various;

import java.util.Scanner;

public class TryCatch2 {

    /*
    Kullanicidan bir cümle alin
    bu cümleyi StringBuilder"a ekleyin
    sonra kullanicidan ayri bir kelime ve hangi indexden itibareen ekleneceini alin
    bu kelimeyi istenilen indexden itibaren ekleyin ve ekrana yazin

 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle giriniz : ");
        String cumle = scanner.nextLine();

        StringBuilder str = new StringBuilder(cumle);
        // StringBuilder str = new StringBuilder();
        // str.append(cumle);
        System.out.print("Kelime giriniz : ");
        String kelime = scanner.nextLine();

        int index;
        try {
            System.out.println("Index giriniz : ");
            index = scanner.nextInt();
        } catch (Exception e) {
            index = 0;
        }

        try {
            str.insert(index, kelime);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Index hatasi. Ekleme yapilmadi");
        }
        System.out.println(str);

    }
}
