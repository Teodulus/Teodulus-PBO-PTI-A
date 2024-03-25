public class Jurusan {
    private String mataPelajaran;
    private String bukuAjar;
    private int jumlahSiswa;

    public Jurusan(String mataPelajaran, String bukuAjar, int jumlahSiswa) {
        this.mataPelajaran = mataPelajaran;
        this.bukuAjar = bukuAjar;
        this.jumlahSiswa = jumlahSiswa;
    }

    public Jurusan(String mataPelajaran, String bukuAjar) {
        this(mataPelajaran, bukuAjar, 0);
    }

    public Jurusan(String mataPelajaran) {
        this(mataPelajaran, "Buku Standar", 0);
    }

    public void mengajar(String kelas) {

    }

    public void praktikum(String kelas) {

    }

    public void sabar() {

    }

    public void kuat() {

    }

    public void semangat() {

    }

    public void testerKabel(int barang) {

    }

    public Jurusan cloneJurusan() {
        return new Jurusan(this.mataPelajaran, this.bukuAjar, this.jumlahSiswa);
    }
}
