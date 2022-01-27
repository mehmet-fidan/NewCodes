package january.classEx1;

public class Insan {

    String isim;
    boolean ehliyet;
    IsMakinesi arac;
    String durum = "bosta";

    public Insan(String isim, boolean ehliyet) {
        this.isim = isim;
        this.ehliyet = ehliyet;

    }

    public void aracBin(IsMakinesi arac) {
        if (arac.getSofor() == null) {
            arac.setSofor(this);
            this.arac = arac;
            System.out.println("Araca bindim");
            durum = "Aracta";
        } else {
            System.out.println("Aracin zaten bir soforu var");
        }
    }


    public void aracIn() {
        if (arac == null) {
            System.out.println("Araca binmedim ki, ineyim");
        } else if (arac.isCalisiyor()) {
            System.out.println("Arac calisiyor inemem");
        } else {
            this.arac.setSofor(null);
            this.arac = null;
            this.durum = "Bosta";
            System.out.println("indim");
        }
    }

    public void sur() {
        if (!ehliyet) {
            System.out.println("Ehliyetim yok ki sureyim");
        } else if (arac == null) {
            System.out.println("Aracta binmedim ki sureyim");
        } else {
            durum = "calisiyor";
            arac.setCalisiyor(true);
            System.out.println("Calisiyorum");
        }
    }

    public void dur() {
        if (arac.isCalisiyor()) {
            System.out.println("Durdum");
            arac.setCalisiyor(false);
            durum = "Durdu";
        } else if (arac == null) {
            System.out.println("Zaten arac kullanmiyorum");
        } else if (!arac.isCalisiyor()) {
            System.out.println("Arac calismiyor ki");
        }
    }

    @Override
    public String toString() {
        return "Sofor Bilgisi= " +
                "Isim: " + isim +"\t" +
                "Ehliyet: " + ehliyet +"\t" +
                "Calisma Durumu: " + durum ;
    }
}
