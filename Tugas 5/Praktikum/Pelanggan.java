import java.util.Scanner;

public class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private String pin;
    private int percobaanGagal = 0;
    private boolean dibekukan = false;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, String pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String dapatkanNomorPelanggan() {
        return nomorPelanggan;
    }

    public String dapatkanNama() {
        return nama;
    }

    public double dapatkanSaldo() {
        return saldo;
    }

    public boolean apakahDibekukan() {
        return dibekukan;
    }

    public boolean otentikasi(String pin) {
        if(this.dibekukan) return false;
        if (!this.pin.equals(pin)) {
            this.percobaanGagal++;
            if (this.percobaanGagal >= 3) {
                this.dibekukan = true;
            }
            return false;
        }
        this.percobaanGagal = 0;
        return true;
    }

    public void tambahSaldo(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
        }
    }

    private void kurangiSaldo(double jumlah) {
        if (this.saldo - jumlah >= 10000) {
            this.saldo -= jumlah;
        }
    }

    private double hitungCashback(double jumlah) {
        String tipeAkun = nomorPelanggan.substring(0, 2);
        double cashback = 0;

        if (jumlah > 1000000) {
            switch (tipeAkun) {
                case "38":
                    cashback = jumlah * 0.05;
                    break;
                case "56":
                    cashback = jumlah * 0.07;
                    break;
                case "74":
                    cashback = jumlah * 0.10;
                    break;
            }
        } else {
            switch (tipeAkun) {
                case "56":
                    cashback = jumlah * 0.02;
                    break;
                case "74":
                    cashback = jumlah * 0.05;
                    break;
            }
        }
        return cashback;
    }

    public boolean beli(double jumlah, String pin) {
        if (!otentikasi(pin)) return false;
        if (this.dibekukan) return false;
        if (this.saldo - jumlah < 10000) return false;
        double cashback = hitungCashback(jumlah);
        kurangiSaldo(jumlah - cashback);
        return true;
    }
}