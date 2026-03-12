// Encapsulation diterapkan dengan modifier 'private'
abstract class KaryawanBase {
    private String nama;
    private String noTelp;

    public KaryawanBase(String nama, String noTelp) {
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilTugas(); // Polymorphic method
}

// Inheritance diterapkan dengan 'extends'
class SupirTravel extends KaryawanBase {
    private String ruteTugas;

    public SupirTravel(String nama, String noTelp, String ruteTugas) {
        super(nama, noTelp);
        this.ruteTugas = ruteTugas;
    }

    @Override
    public void tampilTugas() {
        System.out.println(getNama() + " (Supir Travel) -> Rute: " + ruteTugas);
    }
}

class SupirRentcar extends KaryawanBase {
    private String jenisSim;

    public SupirRentcar(String nama, String noTelp, String jenisSim) {
        super(nama, noTelp);
        this.jenisSim = jenisSim;
    }

    @Override
    public void tampilTugas() {
        System.out.println(getNama() + " (Supir Rentcar) -> Tipe SIM: " + jenisSim);
    }
}

class Admin extends KaryawanBase {
    private String shiftKerja;

    public Admin(String nama, String noTelp, String shiftKerja) {
        super(nama, noTelp);
        this.shiftKerja = shiftKerja;
    }

    @Override
    public void tampilTugas() {
        System.out.println(getNama() + " (Admin) -> Shift: " + shiftKerja);
    }
}

public class MainKasus31a {
    // METHOD DENGAN POLYMORPHIC ARGUMENT
    public static void evaluasiKinerja(KaryawanBase k) {
        System.out.print("[HRD Check] ");
        k.tampilTugas();
    }

    public static void main(String[] args) {
        // Membuat 4 objek berbeda (Polymorphism)
        KaryawanBase k1 = new SupirTravel("Andi", "081", "Surabaya - Malang");
        KaryawanBase k2 = new SupirTravel("Budi", "082", "Madura - Malang");
        KaryawanBase k3 = new SupirRentcar("Cipto", "083", "SIM A Umum");
        KaryawanBase k4 = new Admin("Dina", "084", "Shift Pagi");

        System.out.println("=== DATA KARYAWAN (POLYMORPHISM) ===");
        evaluasiKinerja(k1);
        evaluasiKinerja(k2);
        evaluasiKinerja(k3);
        evaluasiKinerja(k4);
    }
}