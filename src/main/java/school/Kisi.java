package school;

import java.util.ArrayList;
import java.util.List;


public abstract class Kisi {
    private String adSoyad;
    private String KimlikNo;
    private int yas;

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        KimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return KimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        KimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", KimlikNo='" + KimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
