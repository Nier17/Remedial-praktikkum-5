package remedial.mains;

import java.util.Scanner;
import remedial.shapes.Kerucut;
import remedial.shapes.Balok;

// Main class untuk menjalankan kalkulator bangun ruang mini
public class KalkulatorBangunRuangMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan header program
        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang Mini Versi A");
        System.out.println("REINHARD FRANO RANDALINGGI");
        System.out.println("245150707111043");
        System.out.println("=============================================");

        // Input dan proses untuk Kerucut
        System.out.println("Kerucut");
        System.out.println("=============================================");
        System.out.print("Isikan nama     : ");
        String namaKerucut = scanner.nextLine();
        System.out.print("Isikan radius   : ");
        double radius = scanner.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiKerucut = scanner.nextDouble();
        System.out.print("Isikan massa    : ");
        double massaKerucut = scanner.nextDouble();
        scanner.nextLine(); // Menghindari bug nextLine()

        // Membuat objek Kerucut dan mengisi datanya
        Kerucut kerucut = new Kerucut(radius);
        kerucut.setNama(namaKerucut);
        kerucut.setTinggi(tinggiKerucut);
        kerucut.setMassa(massaKerucut);

        // Menampilkan data Kerucut
        kerucut.printInfo();

        // Input dan proses untuk Balok
        System.out.println("Balok");
        System.out.println("=============================================");
        System.out.print("Isikan nama     : ");
        String namaBalok = scanner.nextLine();
        System.out.print("Isikan panjang  : ");
        double panjang = scanner.nextDouble();
        System.out.print("Isikan lebar    : ");
        double lebar = scanner.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiBalok = scanner.nextDouble();
        System.out.print("Isikan massa    : ");
        double massaBalok = scanner.nextDouble();

        // Membuat objek Balok dan mengisi datanya
        Balok balok = new Balok(panjang, lebar);
        balok.setNama(namaBalok);
        balok.setTinggi(tinggiBalok);
        balok.setMassa(massaBalok);

        // Menampilkan data Balok
        balok.printInfo();

        scanner.close();
    }
}

