package january.classEx1;

public class Main {

    public static void main(String[] args) {


        Insan ali = new Insan("Ali", true);
        Insan veli = new Insan("Veli", false);
        IsMakinesi kamyon = new IsMakinesi("Kamyon");
        IsMakinesi kepce = new IsMakinesi("Kepce");

        ali.aracBin(kamyon);
        ali.sur();
        ali.aracIn();
        ali.dur();
        ali.aracIn();
        System.out.println(ali);
       System.out.println("---------");


        veli.aracBin(kepce);
        veli.sur();
        System.out.println(veli);
    }


}
