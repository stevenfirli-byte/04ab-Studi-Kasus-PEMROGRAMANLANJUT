import java.util.Scanner;

class Karyawan {
    String idKaryawan;
    String nama;
    String alamat;
    String noTelp;
    String jenisKelamin;
    String kategori;

    // Constructor
    public Karyawan(String idKaryawan, String nama, String alamat, String noTelp, String jenisKelamin,
            String kategori) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.kategori = kategori;
    }

    // Behaviour 1
    public void bekerja() {
        System.out.println("-> " + nama + " mulai bekerja sebagai " + kategori + ".");
    }

    // Behaviour 2: Mencetak Data
    public void cetakData() {
        System.out.println("ID: " + idKaryawan + " | Nama: " + nama + " | Alamat: " + alamat +
                " | Telp: " + noTelp + " | L/P: " + jenisKelamin + " | Kategori: " + kategori);
    }
}

public class MainKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Karyawan[] daftarKaryawan = new Karyawan[3];

        System.out.println("=== INPUT DATA KARYAWAN FILKOM TOUR & TRAVEL ===");

        // Looping untuk input 3 karyawan
        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));
            System.out.print("ID Karyawan : ");
            String id = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("Alamat      : ");
            String alamat = sc.nextLine();
            System.out.print("No Telp     : ");
            String noTelp = sc.nextLine();
            System.out.print("L/P         : ");
            String jk = sc.nextLine();

            // Validasi / Pilihan untuk 3 Kategori
            String kategori = "";
            boolean kategoriValid = false;
            while (!kategoriValid) {
                System.out.println("Pilih Kategori Karyawan:");
                System.out.println("1. Supir Travel");
                System.out.println("2. Supir Rentcar");
                System.out.println("3. Admin");
                System.out.print("Masukkan pilihan (1/2/3): ");
                String pilihan = sc.nextLine();

                if (pilihan.equals("1")) {
                    kategori = "Supir Travel";
                    kategoriValid = true;
                } else if (pilihan.equals("2")) {
                    kategori = "Supir Rentcar";
                    kategoriValid = true;
                } else if (pilihan.equals("3")) {
                    kategori = "Admin";
                    kategoriValid = true;
                } else {
                    System.out.println("Pilihan tidak valid! Silakan masukkan 1, 2, atau 3.\n");
                }
            }

            // Membuat objek melalui Constructor
            daftarKaryawan[i] = new Karyawan(id, nama, alamat, noTelp, jk, kategori);
        }

        System.out.println("\n=== OUTPUT DATA KARYAWAN ===");
        for (Karyawan k : daftarKaryawan) {
            k.cetakData();
            k.bekerja();
            System.out.println("------------------------------------------------");
        }
        sc.close();
    }
}