package school;

public class Ogrenci extends Kisi{
    private String numara;
    private String Sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        Sinif = sinif;
    }

    public Ogrenci(String numara, String sinif) {
        this.numara = numara;
        Sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return Sinif;
    }

    public void setSinif(String sinif) {
        Sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "numara='" + numara + '\'' +
                ", Sinif='" + Sinif + '\'' +
                '}';
    }
}
