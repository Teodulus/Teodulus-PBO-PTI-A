public class Main {
    public static void main(String[] args) {

        Jurusan jurusan1 = new Jurusan("Matematika komputasi", "Buku Matematika komputasi", 38);


        Jurusan jurusan2 = new Jurusan("", "Teknologi layanan jaringan");


        Jurusan jurusan3 = new Jurusan("Arsitektur Infrastruktur jaringan");

        jurusan1.mengajar("Kelas TKJ-AK");
        jurusan2.praktikum("Kelas TKJ-WU");
        jurusan3.semangat();


        Jurusan jurusan4 = jurusan1.cloneJurusan();
    }
}
