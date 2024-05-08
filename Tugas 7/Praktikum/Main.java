import java.util.Scanner;

public class Main {
    private static Kue[] kueArray = new Kue[20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeKueArray();

        while (true) {
            System.out.println("Pilih Menu:");
            System.out.println("1. Tampilkan semua kue");
            System.out.println("2. Hitung total harga semua kue");
            System.out.println("3. Hitung total harga dan berat KuePesanan");
            System.out.println("4. Hitung total harga dan jumlah KueJadi");
            System.out.println("5. Tampilkan kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan lama hari KueBasi");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaKue();
                    break;
                case 2:
                    hitungTotalHargaSemuaKue();
                    break;
                case 3:
                    hitungTotalHargaBeratKuePesanan();
                    break;
                case 4:
                    hitungTotalHargaJumlahKueJadi();
                    break;
                case 5:
                    tampilkanKueHargaTertinggi();
                    break;
                case 6:
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    private static void initializeKueArray() {
        kueArray[0] = new KuePesanan("Kue Mangkok", 1000, 0.5);
        kueArray[1] = new KueJadi("Donat", 1500, 12);
        kueArray[2] = new KueBasi("Roti Basi", 800, 3);
    }

    private static void tampilkanSemuaKue() {
        for (Kue kue : kueArray) {
            if (kue != null) {
                System.out.println(kue);
            }
        }
    }

    private static void hitungTotalHargaSemuaKue() {
        double total = 0;
        for (Kue kue : kueArray) {
            if (kue != null) {
                total += kue.hitungHarga();
            }
        }
        System.out.println("Total harga semua kue: " + total);
    }

    private static void hitungTotalHargaBeratKuePesanan() {
        double totalHarga = 0, totalBerat = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) kue;
                totalHarga += kp.hitungHarga();
                totalBerat += kp.getBerat();
            }
        }
        System.out.println("Total harga KuePesanan: " + totalHarga + ", Total berat: " + totalBerat);
    }

    private static void hitungTotalHargaJumlahKueJadi() {
        double totalHarga = 0, totalJumlah = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                KueJadi kj = (KueJadi) kue;
                totalHarga += kj.hitungHarga();
                totalJumlah += kj.getJumlah();
            }
        }
        System.out.println("Total harga KueJadi: " + totalHarga + ", Total jumlah: " + totalJumlah);
    }

    private static void tampilkanKueHargaTertinggi() {
        Kue kueDenganHargaTertinggi = null;
        double maxHarga = 0;
        for (Kue kue : kueArray) {
            if (kue != null && kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueDenganHargaTertinggi = kue;
            }
        }
        if (kueDenganHargaTertinggi != null) {
            System.out.println("Kue dengan harga tertinggi: " + kueDenganHargaTertinggi);
        }
    }
}
