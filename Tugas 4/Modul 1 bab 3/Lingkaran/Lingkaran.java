public class Lingkaran {
    private int alas, tinggi;

    public Lingkaran(int alas) {
        this.alas = alas;
    }

    public Lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Lingkaran(String alas, String tinggi) {
        this.alas = parseInt(alas);
        this.tinggi = parseInt(tinggi);
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }

    private int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid, nilai default (0) digunakan.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();

        Lingkaran l2 = new Lingkaran(4, 10);
        l2.displayMessage();

        Lingkaran lString = new Lingkaran("500", "7");
        lString.displayMessage();
    }
}
