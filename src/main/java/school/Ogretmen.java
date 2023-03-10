package school;

import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Kisi {
    private String bolum;
    private int sicilNo;
    private List<Ogretmen>ogretmenListesi=new ArrayList<>();

    public List<Ogretmen> getOgretmenListesi() {
        return ogretmenListesi;
    }

    public void setOgretmenListesi(List<Ogretmen> ogretmenListesi) {
        this.ogretmenListesi = ogretmenListesi;
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String bolum, int sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public void listeyeOgretmenEkle(Ogretmen ogretmen){
        ogretmenListesi.add(ogretmen);
    }
    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }
}
