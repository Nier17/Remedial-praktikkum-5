package remedial.shapes;

import remedial.bases.BangunRuang;
import remedial.interfaces.MemilikiVolume;
import remedial.interfaces.MemilikiBerat;
import remedial.interfaces.MemilikiGarisPelukis;

// Class Kerucut yang merupakan turunan dari BangunRuang
// dan mengimplementasikan tiga interface
public class Kerucut extends BangunRuang implements MemilikiVolume, MemilikiBerat, MemilikiGarisPelukis {
    // Atribut khusus kerucut
    private double radius;
    
    // Konstanta PI berupa pembilang dan penyebut
    private static final int PI_PEMBILANG = 22;
    private static final int PI_PENYEBUT = 7;

    // Constructor untuk menginisialisasi radius
    public Kerucut(double radius) {
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Menghitung volume kerucut
    @Override
    public double hitungVolume() {
        return (1.0/3.0) * ((double)PI_PEMBILANG/PI_PENYEBUT) * radius * radius * tinggi;
    }

    // Menghitung berat kerucut (massa * gravitasi)
    @Override
    public double hitungBerat() {
        return massa * g; // g diambil dari interface MemilikiBerat
    }

    // Menghitung panjang garis pelukis menggunakan teorema Pythagoras
    @Override
    public double hitungGarisPelukis() {
        return Math.sqrt(radius * radius + tinggi * tinggi);
    }

    // Menampilkan seluruh informasi kerucut
    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Radius          : " + radius);
        System.out.println("Tinggi          : " + tinggi);
        System.out.println("Massa           : " + massa);
        System.out.println("Volume          : " + hitungVolume());
        System.out.println("Berat           : " + hitungBerat());
        System.out.println("Garis pelukis   : " + hitungGarisPelukis());
        System.out.println("=============================================");
    }
}
