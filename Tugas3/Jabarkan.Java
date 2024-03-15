Jurusan
+mataPelajaran: String
+bukuAjar: String
+jumlahSiswa int
+mengajar (kelas: String): void
+praktikum (kelas: String): void
+sabar(): void

ruangan di kelas
+meja: int
+kursi: int
+smartTv: String
+pojokBuku: String
+jumlahSiswa (siswa : int): void
+namaKelompok(kelompok: String): void
+bermain(): void

Ruang Guru
+jumlahGuru: Int
+mengisiRps: String
+sedangWorkshop: Boolean
+tegang(): void
+absensiGuru(absen: List): void
+koreksi Nilai (nilai: double): void


public class Jurusan {
    private String mataPelajaran;
    private String bukuAjar;
    private int jumlahSiswa;

    public void mengajar(String kelas) {
      
    }

    public void praktikum(String kelas) {
        
    }

    public void sabar() {
        
    }
}

public class RuanganDiKelas {
    private int meja;
    private int kursi;
    private String smartTv;
    private String pojokBuku;


    public void jumlahSiswa(int siswa) {

    }

    public void namaKelompok(String kelompok) {

    }

    public void bermain() {

    }
}

public class RuangGuru {
    private int jumlahGuru;
    private String mengisiRps;
    private boolean sedangWorkshop;

    public void tegang() {

    }

    public void absensiGuru(List absen) {
       
    }

    public void koreksiNilai(double nilai) {
       
    }
}
