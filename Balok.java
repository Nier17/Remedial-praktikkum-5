package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.interfaces.MemilikiVolume;
import remedial.interfaces.MemilikiBerat;

// Class Balok yang merupakan turunan dari BangunRuang
// dan mengimplementasikan dua interface
public class Balok extends BangunRuang implements MemilikiVolume, MemilikiBerat {
    // Atribut khusus balok
    private double panjang;
    private double lebar;

    // Constructor untuk menginisialisasi panjang dan lebar
    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // Getter untuk lebar
    public double getLebar() {
        return lebar;
    }

    // Menghitung volume balok
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Menghitung berat balok (massa * gravitasi)
    @Override
    public double hitungBerat() {
        return massa * g; // g dari interface MemilikiBerat
    }

    // Menampilkan seluruh informasi balok
    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Panjang         : " + panjang);
        System.out.println("Lebar           : " + lebar);
        System.out.println("Tinggi          : " + tinggi);
        System.out.println("Massa           : " + massa);
        System.out.println("Volume          : " + hitungVolume());
        System.out.println("Berat           : " + hitungBerat());
        System.out.println("=============================================");
    }
}
