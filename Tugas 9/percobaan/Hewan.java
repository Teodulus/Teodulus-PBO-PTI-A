package latihaninterface;

public class Hewan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama hewan: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur hewan: " + this.umur);
    }

    // Setter methods to set name and age
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
