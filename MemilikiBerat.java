package remedial.interfaces;

// Interface untuk bangun ruang yang dapat menghitung berat
public interface MemilikiBerat {
    // Konstanta gravitasi
    double g = 9.8;

    // Method untuk menghitung berat (massa * gravitasi)
    double hitungBerat();
}
