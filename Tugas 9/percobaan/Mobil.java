public class Mobil implements MakhlukHidup {
    private String merk;
    private int tahun;

    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    @Override
    public void makan() {
        System.out.println("Mobil ini membutuhkan bahan bakar");
    }

    @Override
    public void berjalan() {
        System.out.println("Mobil ini berjalan dengan 4 roda");
    }

    @Override
    public void bersuara() {
        System.out.println("Mobil ini memiliki suara mesin yang halus");
    }

    public void tampilkanMerk() {
        System.out.println("Merk mobil: " + this.merk);
    }

    public void tampilkanTahun() {
        System.out.println("Tahun pembuatan: " + this.tahun);
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2020);
        mobil.tampilkanMerk();
        mobil.tampilkanTahun();
        mobil.makan();
        mobil.berjalan();
        mobil.bersuara();
    }
}
