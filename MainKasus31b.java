// Encapsulation diterapkan dengan modifier 'private'
abstract class MobilBase {
    private String noPlat;
    private String merkMobil;

    public MobilBase(String noPlat, String merkMobil) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public abstract void cekFasilitas(); // Polymorphic method
}

// Inheritance diterapkan dengan 'extends'
class MobilPribadi extends MobilBase {
    private String tipeAudio;

    public MobilPribadi(String noPlat, String merkMobil, String tipeAudio) {
        super(noPlat, merkMobil);
        this.tipeAudio = tipeAudio;
    }

    @Override
    public void cekFasilitas() {
        System.out.println("Mobil Pribadi (" + getMerkMobil() + ") -> Audio: " + tipeAudio);
    }
}

class MiniBus extends MobilBase {
    private boolean adaAC;

    public MiniBus(String noPlat, String merkMobil, boolean adaAC) {
        super(noPlat, merkMobil);
        this.adaAC = adaAC;
    }

    @Override
    public void cekFasilitas() {
        String statusAC = adaAC ? "AC Dingin" : "Non-AC";
        System.out.println("MiniBus (" + getMerkMobil() + ") -> Fasilitas: " + statusAC);
    }
}

class Bus extends MobilBase {
    private int jumlahToilet;

    public Bus(String noPlat, String merkMobil, int jumlahToilet) {
        super(noPlat, merkMobil);
        this.jumlahToilet = jumlahToilet;
    }

    @Override
    public void cekFasilitas() {
        System.out.println("Bus (" + getMerkMobil() + ") -> Toilet: " + jumlahToilet + " buah");
    }
}

public class MainKasus31b {
    // METHOD DENGAN POLYMORPHIC ARGUMENT
    public static void inspeksiKendaraan(MobilBase m) {
        System.out.print("[Inspeksi " + m.getNoPlat() + "] ");
        m.cekFasilitas();
    }

    public static void main(String[] args) {
        // Membuat 4 objek berbeda (Polymorphism)
        MobilBase m1 = new MobilPribadi("N 111 AA", "Avanza", "Dolby");
        MobilBase m2 = new MiniBus("L 222 BB", "Hiace", true);
        MobilBase m3 = new MiniBus("P 333 CC", "Elf", false);
        MobilBase m4 = new Bus("W 444 DD", "Scania", 1);

        System.out.println("=== DATA KENDARAAN (POLYMORPHISM) ===");
        inspeksiKendaraan(m1);
        inspeksiKendaraan(m2);
        inspeksiKendaraan(m3);
        inspeksiKendaraan(m4);
    }
}