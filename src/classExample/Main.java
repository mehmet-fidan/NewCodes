package classExample;

public class Main {
    public static void main(String[] args) {
        Insan i1 = new Insan();
        i1.veriAta("Ali", 20);

        Insan i2 = new Insan();
        i2.veriAta("Hasan", 45);

        Insan i3 = new Insan();
        i3.veriAta("Ayse", 45);

        i1.babaAta(i2);
        i1.anneAta(i3);
        i1.senKimsin();
        i1.babanKim();
        i1.annenKim();
        System.out.println("**********");
        Insan i4 = new Insan();
        i4.veriAta("elif", 24);

        Insan i5 = new Insan();
        i5.veriAta("Kamil", 42);

        Insan i6 = new Insan();
        i6.veriAta("Halime", 36);

        i4.anneAta(i6);
        i4.babaAta(i5);
        i4.senKimsin();
        i4.babanKim();
        i4.annenKim();
        System.out.println("*******");
        Insan dede = new Insan();
        dede.veriAta("Huseyin", 72);

        i5.babaAta(dede);
        i5.babanKim();

    }
}