class KueBasi extends Kue {
    private int lamaHari;

    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    @Override
    double hitungHarga() {
        return harga - (lamaHari * (harga * 0.1));
    }
}
