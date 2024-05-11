public class Main {
    public static void main(String[] args) {
        Pegawai[] pegawais = new Pegawai[9];

        pegawais[0] = new PegawaiTetap("Deonsius", "123456789", 5000000);
        pegawais[1] = new PegawaiTetap("Katarina", "987654321", 4500000);
        pegawais[2] = new PegawaiTetap("Leonardo", "192837465", 5500000);

        pegawais[3] = new PegawaiHarian("ByungHoon", "123123123", 20000, 45);
        pegawais[4] = new PegawaiHarian("SaeRon", "321321321", 15000, 38);
        pegawais[5] = new PegawaiHarian("MaYong", "456456456", 18000, 50);

        pegawais[6] = new Sales("Kusuma", "789789789", 10000000, 0.1);
        pegawais[7] = new Sales("DwiPangga", "654654654", 8000000, 0.15);
        pegawais[8] = new Sales("Sokila", "987987987", 12000000, 0.1);

        System.out.println("===========================================");
        System.out.println("Daftar Gaji Pegawai Perusahaan Pak Irwan (Irwan Group) ");
        System.out.println("===========================================");

        System.out.println("\n=== Pegawai Tetap ===");
        for (int i = 0; i < 3; i++) {
            System.out.println(pegawais[i]);
        }

        System.out.println("\n=== Pegawai Harian ===");
        for (int i = 3; i < 6; i++) {
            System.out.println(pegawais[i]);
        }

        System.out.println("\n=== Sales ===");
        for (int i = 6; i < 9; i++) {
            System.out.println(pegawais[i]);
        }

        System.out.println("===========================================\n");
    }
}
