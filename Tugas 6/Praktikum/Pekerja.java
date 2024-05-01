import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        int tahunKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahunKerja <= 5) {
            return gaji * 0.05;
        } else if (tahunKerja <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + gaji;
    }
}
