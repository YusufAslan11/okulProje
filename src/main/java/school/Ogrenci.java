package school;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends Kisi{
    private String numara;
    private String Sinif;
    private List<Ogrenci> ogrenciListesi=new ArrayList<>();

    public List<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        Sinif = sinif;
    }
    public Ogrenci(String adSoyad, String kimlikNo, int yas) {
        super(adSoyad, kimlikNo, yas);
    }

    public Ogrenci() {
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

    public void listeyeOgrenciEkle(Ogrenci ogrenci) {
        ogrenciListesi.add(ogrenci);
    }


    }

