import java.util.Scanner;

class Mobil {
    String noPlat;
    String merkMobil;
    String warnaMobil;
    int tahunKeluaran;
    int kapasitasPenumpang; // Atribut tambahan (dst)

    // Constructor
    public Mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran, int kapasitasPenumpang) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaran = tahunKeluaran;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Behaviour 1
    public void nyalakanMesin() {
        System.out.println("-> Mesin mobil " + merkMobil + " menyala.");
    }

    // Behaviour 2
    public void cetakData() {
        System.out.println("Plat: " + noPlat + " | Merk: " + merkMobil + " | Warna: " + warnaMobil +
                " | Tahun: " + tahunKeluaran + " | Kapasitas: " + kapasitasPenumpang + " org");
    }
}

public class MainKasus21a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobil[] daftarMobil = new Mobil[3];

        System.out.println("=== INPUT DATA MOBIL ===");
        // Looping pembuatan 3 objek
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mobil ke-" + (i + 1));
            System.out.print("No Plat    : ");
            String noPlat = sc.nextLine();
            System.out.print("Merk Mobil : ");
            String merk = sc.nextLine();
            System.out.print("Warna      : ");
            String warna = sc.nextLine();
            System.out.print("Tahun      : ");
            int tahun = sc.nextInt();
            System.out.print("Kapasitas  : ");
            int kapasitas = sc.nextInt();
            sc.nextLine(); // Clear buffer

            daftarMobil[i] = new Mobil(noPlat, merk, warna, tahun, kapasitas);
        }

        System.out.println("\n=== OUTPUT DATA MOBIL ===");
        for (Mobil m : daftarMobil) {
            m.cetakData();
            m.nyalakanMesin();
            System.out.println("-------------------------");
        }
        sc.close();
    }
}