package january;

public class BiletBilgileri {

    String binisYeri;
    String binisSaati;
    String varisYeri;
    String varisSaati;
    String yolculukTarihi;
    int seferNo;
    String guzergah;
    int koltukNo;

    public BiletBilgileri(String binisYeri, String binisSaati, String varisYeri,
                          String varisSaati, String yolculukTarihi) {
        this.binisYeri = binisYeri;
        this.binisSaati = binisSaati;
        this.varisYeri = varisYeri;
        this.varisSaati = varisSaati;
        this.yolculukTarihi = yolculukTarihi;
    }

    public BiletBilgileri(String binisYeri, String binisSaati, String varisYeri,
                          String varisSaati, String yolculukTarihi, int seferNo, String guzergah, int koltukNo) {
        this (binisYeri,binisSaati,varisYeri,varisSaati,yolculukTarihi);
        this.seferNo = seferNo;
        this.guzergah = guzergah;
        this.koltukNo = koltukNo;
    }

    public String getBinisYeri() {  return binisYeri;    }

    public void setBinisYeri(String binisYeri) { this.binisYeri = binisYeri;    }

    public String getBinisSaati() {  return binisSaati;    }

    public void setBinisSaati(String binisSaati) {   this.binisSaati = binisSaati;    }

    public String getVarisYeri() {  return varisYeri;    }

    public void setVarisYeri(String varisYeri) { this.varisYeri = varisYeri;    }

    public String getVarisSaati() { return varisSaati;    }

    public void setVarisSaati(String varisSaati) {  this.varisSaati = varisSaati;    }

    public String getYolculukTarihi() { return yolculukTarihi;    }

    public void setYolculukTarihi(String yolculukTarihi) { this.yolculukTarihi = yolculukTarihi;    }

    public int getSeferNo() {return seferNo;    }

    public void setSeferNo(int seferNo) { this.seferNo = seferNo;    }

    public String getGuzergah() { return guzergah;    }

    public void setGuzergah(String guzergah) { this.guzergah = guzergah;    }

    public int getKoltukNo() { return koltukNo;    }

    public void setKoltukNo(int koltukNo) {this.koltukNo = koltukNo;    }

    @Override
    public String toString() {
        return "Bilet Bilgileri :" +
                "\nBinis Yeri : " + binisYeri +
                "\nBinis Saati : " + binisSaati +
                "\nVaris Yeri : " + varisYeri +
                "\nVaris Saati : " + varisSaati +
                "\nYolculuk Tarihi :" + yolculukTarihi +
                "\nSefer No : " + seferNo +
                "\nGuzergah : " + guzergah +
                "\nKoltuk No : " + koltukNo ;
    }
}
