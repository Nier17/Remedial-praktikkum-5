package remedial.bases;

// Abstract class sebagai dasar semua bangun ruang
public abstract class BangunRuang {
    // Atribut umum bangun ruang
    protected String nama;
    protected double tinggi;
    protected double massa;

    // Constructor kosong
    public BangunRuang() {
        // tidak melakukan apa-apa
    }

    // Setter untuk nama
    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk tinggi
    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Setter untuk massa
    public void setMassa(double inputMassa) {
        this.massa = inputMassa;
    }

    // Getter untuk massa
    public double getMassa() {
        return massa;
    }

    // Method abstract yang harus diimplementasi oleh turunan
    public abstract void printInfo();
}
