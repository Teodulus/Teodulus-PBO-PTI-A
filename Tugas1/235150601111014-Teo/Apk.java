import java.util.Scanner;

public class Apk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        int[] hasilKonversi = new int[4];

        while (repeat) {
            System.out.print("Masukkan bilangan desimal: ");
            int angkaDesimal = scanner.nextInt();

            hasilKonversi[0] = angkaDesimal; // Simpan bilangan desimal
            hasilKonversi[1] = Integer.parseInt(desimalKe(angkaDesimal, 2)); 
            hasilKonversi[2] = Integer.parseInt(desimalKe(angkaDesimal, 8)); 
            hasilKonversi[3] = Integer.parseInt(desimalKe(angkaDesimal, 16)); 

            System.out.println("Hasil konversi ke biner: " + hasilKonversi[1]);
            System.out.println("Hasil konversi ke oktal: " + hasilKonversi[2]);
            System.out.println("Hasil konversi ke heksadesimal: " + Integer.toHexString(hasilKonversi[3]));

            System.out.print("Apakah ingin mengulang perhitungan? (y/t): ");
            String repeatInput = scanner.next();
            repeat = repeatInput.equalsIgnoreCase("y");
        }

        System.out.println("Terima kasih telah menggunakan kalkulator konversi!");
    }

    static String desimalKe(int decimal, int base) {
        return Integer.toString(decimal, base);
    }
}
