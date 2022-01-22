package january.various;

public class OtoBilet1401 {
    public static void main(String[] args) {
        YolcuBilgiler yolcu1 = new YolcuBilgiler("Ahmet","Kaya", 136348);
        yolcu1.Adress = "Ankara Gari Yani";
        yolcu1.E_mail ="bilinmezhat@gmail.com";

        BiletBilgileri bilet1 = new BiletBilgileri("Ankara","17: 45","Izmir","04:30","17/12/2022");
        bilet1.guzergah ="Ankara-Eskisehir-Aydin-Izmir";
        bilet1.seferNo = 13;
        bilet1.koltukNo = 21;

        System.out.println(yolcu1 +"\n" +"\n*****" + "\n" + bilet1);

    }
}
