public class Mahasiswa {
    private String nama;
    private int jumlahKataPerHari;

    public Mahasiswa(String nama, int jumlahKataPerHari) {
        this.nama = nama;
        this.jumlahKataPerHari = jumlahKataPerHari;
    }

    
    public int hitungHariMenulis(int jumlahHalamanBuku) {
        int jumlahKataPerBuku = 200 * jumlahHalamanBuku;
        int jumlahHari = jumlahKataPerBuku / jumlahKataPerHari;
        return jumlahHari;
    }
    public void printHasil(int jumlahHalamanBuku) {
        int jumlahHari = hitungHariMenulis(jumlahHalamanBuku);
        System.out.println("Mahasiswa " + nama + " akan membutuhkan " + jumlahHari + " hari untuk menulis buku dengan " + jumlahHalamanBuku + " halaman.");
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswaA = new Mahasiswa("A", 100);
        mahasiswaA.printHasil(50); // 50 halaman buku
    }
}
