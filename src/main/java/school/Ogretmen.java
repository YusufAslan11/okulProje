package school;

import java.util.List;

public class Ogretmen extends Kisi {
    private String bolum;
    private int sicilNo;

    @Override
    public List<Ogretmen> getOgretmenListesi() {
        return super.getOgretmenListesi();
    }

    @Override
    public void setOgretmenListesi(List<Ogretmen> ogretmenListesi) {
        super.setOgretmenListesi(ogretmenListesi);
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

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                '}';
    }
}
