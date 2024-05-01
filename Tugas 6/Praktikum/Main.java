import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Manusia lakiMenikah = new Manusia("Kristina Muliana", true, "36193910023481", true);
        System.out.println(lakiMenikah.toString());

        Manusia perempuanMenikah = new Manusia("Anatasius Polena", false, "91820374882917", true);
        System.out.println(perempuanMenikah.toString());

        Manusia belumMenikah = new Manusia("Alicia Gunawan", false, "81920381765423", false);
        System.out.println(belumMenikah.toString());

        MahasiswaFILKOM mahasiswa = new MahasiswaFILKOM("Andika Pasaribu", true, "88293765102357", false, "165150601111111", 3.75);
        System.out.println(mahasiswa.toString());

        Pekerja pekerja = new Pekerja("Budiman sukataryo", true, "01927366518253", true, 5000, LocalDate.of(2010, 1, 1), 2);
        System.out.println(pekerja.toString());

        Manager manager = new Manager("Klarisa Sekar", false, "73629460618562", false, 7500, LocalDate.of(2009, 1, 1), 0, "HR");
        System.out.println(manager.toString());
    }
}
