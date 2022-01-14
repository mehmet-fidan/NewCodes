package january;

public class YolcuBilgiler {

    String name;
    String surname;
    String Adress;
    int phone;
    String E_mail;

    public YolcuBilgiler(String name, String surname, int phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public YolcuBilgiler(String name, String surname, String adress, int phone, String e_mail) {
        this(name,surname,phone);
        Adress = adress;
        E_mail = e_mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname;    }

    public String getAdress() {   return Adress;   }

    public void setAdress(String adress) {  Adress = adress;    }

    public int getPhone() {  return phone;    }

    public void setPhone(int phone) {   this.phone = phone;    }

    public String getE_mail() { return E_mail;    }

    public void setE_mail(String e_mail) {  E_mail = e_mail;    }

    @Override
    public String toString() {
        return "Yolcu Bilgileri" +
                "\nName : " + name +
                "\nSurname : " + surname +
                "\nAdress : " + Adress +
                "\nPhone : " + phone +
                "\nE-mail : " + E_mail;
    }
}
