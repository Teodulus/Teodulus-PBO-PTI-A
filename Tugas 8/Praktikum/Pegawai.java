public abstract class Pegawai {
    protected String nama;
    protected String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public abstract double hitungGaji();

    @Override
    public String toString() {
        return "Nama: " + nama + "\nNo. KTP: " + noKTP;
    }
}
