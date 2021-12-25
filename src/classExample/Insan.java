package classExample;

public class Insan {
    String adi;
    int yas;
    Insan baba;
    Insan anne;
    Insan cocuk;

    public void veriAta(String adi, int yas) {
        this.adi = adi;
        this.yas = yas;
    }

    public void babaAta(Insan insan) {
        baba = insan;

    }

    public void anneAta(Insan insan) {
        anne = insan;
    }

    public void senKimsin() {
        System.out.println("benim adim " + adi + " " + yas + " yasindayim.");
    }

    public void babanKim() {
        System.out.println("Babamin adi " + baba.adi + " ve " + baba.yas + " yasinda");
    }

    public void annenKim() {
        System.out.println("Annemin adi " + anne.adi + " ve " + anne.yas + " yasinda");
    }

}