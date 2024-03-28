
import java.util.Scanner;

public class SistemPelanggan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = scanner.nextLine();

        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan saldo pelanggan: ");
        double saldo = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Masukkan PIN pelanggan: ");
        String pin = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(nomorPelanggan, nama, saldo, pin);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Beli Komoditas Kehidupan");
            System.out.println("2. Top-up saldo");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Minimal saldo untuk pembelian 10010");
                    System.out.println("Masukkan jumlah pembelian: ");
                    double jumlahPembelian = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.print("Masukkan PIN untuk pembelian: ");
                    String pinPembelian = scanner.nextLine();

                    boolean statusPembelian = pelanggan.beli(jumlahPembelian, pinPembelian);
                    if (statusPembelian) {
                        System.out.println("Pembelian berhasil. Sisa saldo: " + pelanggan.dapatkanSaldo());
                    } else {
                        System.out.println("Pembelian gagal.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan jumlah top-up: ");
                    double jumlahTopUp = scanner.nextDouble();

                    pelanggan.tambahSaldo(jumlahTopUp);
                    System.out.println("Setelah top-up, saldo: " + pelanggan.dapatkanSaldo());
                    break;
                case 3:
                    System.out.println("Terima kasih. Jangan kapok ya!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}