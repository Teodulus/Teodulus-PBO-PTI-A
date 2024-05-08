abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    abstract double hitungHarga();

    @Override
    public String toString() {
        return this.nama + " dengan harga: " + hitungHarga();
    }
}
