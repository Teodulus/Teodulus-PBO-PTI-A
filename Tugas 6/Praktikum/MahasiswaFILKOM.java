public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodiDigit = Character.getNumericValue(nim.charAt(6));
        String prodi = switch (prodiDigit) {
            case 2 -> "Teknik Informatika";
            case 3 -> "Teknik Komputer";
            case 4 -> "Sistem Informasi";
            case 6 -> "Pendidikan Teknologi Informasi";
            case 7 -> "Teknologi Informasi";
            default -> "Unknown";
        };
        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus();
    }
}
