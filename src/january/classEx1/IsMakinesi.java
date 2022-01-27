package january.classEx1;

public class IsMakinesi {

    private String isim;
    private  boolean calisiyor;
    private Insan sofor;

    public IsMakinesi(String isim) {
        this.isim = isim;
        this.calisiyor = calisiyor;
    }

    public Insan getSofor() {
        return sofor;
    }

    public void setSofor(Insan sofor) {
        this.sofor = sofor;
    }

    public boolean isCalisiyor() {
        return calisiyor;
    }

    public void setCalisiyor(boolean calisiyor) {
        this.calisiyor = calisiyor;
    }

    @Override
    public String toString() {
        return "IsMakinesi{" +
                "isim='" + isim + '\'' +
                ", calisiyor=" + calisiyor +
                ", sofor=" + sofor +
                '}';
    }

}
