import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        Student[] siswa = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa " + (i + 1) + ":");

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Umur: ");
            int umur = scanner.nextInt();

            System.out.print("Nilai Matematika: ");
            double nilaiMatematika = scanner.nextDouble();

            System.out.print("Nilai Inggris: ");
            double nilaiInggris = scanner.nextDouble();

            System.out.print("Nilai IPA: ");
            double nilaiIPA = scanner.nextDouble();
            scanner.nextLine();

            siswa[i] = new Student(nama, alamat, umur, nilaiMatematika, nilaiInggris, nilaiIPA);

            System.out.println();
        }

        System.out.println("=== Informasi Siswa ===");
        for (Student s : siswa) {
            s.displayMessage();
            System.out.println("-------------------");
        }

        Student.jumlahObjek();

        scanner.close();
    }
}