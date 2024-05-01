import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (super.getGaji() * 0.1); // Tunjangan 10% dari gaji
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}
