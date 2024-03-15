import java.util.Scanner;

class Mobil {
    private String noPlat;   
    private String warna;    
    private String manufaktur;
    private double kecepatan; 
    private double waktu;     
    
    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat;
    }
    
    public void setWarna(String warna) { 
        this.warna = warna;
    }
    
    public void setManufaktur(String manufaktur) { 
        this.manufaktur = manufaktur;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = rubahKecepatan(kecepatan);
    }
    
    private double rubahKecepatan(double kecepatanKmPerJam) {
        return kecepatanKmPerJam * 0.27778;
    }
    
    public void setWaktu(double waktu) {
        this.waktu = rubahSekon(waktu);
    }

    private double rubahSekon(double waktuJam) {
        return waktuJam * 3600;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur); 
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s."); 
        if (waktu > 0) {
            double waktuJam = waktu / 3600;             
            System.out.println("Dalam waktu " + waktuJam + " jam, mobil ini dapat menempuh jarak sekitar " + (kecepatan * waktu) / 1000 + " km.");
        }
    }

    public double hitungJarak() {
        return kecepatan * waktu;
    }
}

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mobil m1 = new Mobil();

        System.out.println("Masukkan detail untuk mobil pertama:");
        System.out.print("Masukkan nomor plat: ");
        m1.setNoPlat(input.nextLine());

        System.out.print("Masukkan warna: ");
        m1.setWarna(input.nextLine());

        System.out.print("Masukkan manufaktur: ");
        m1.setManufaktur(input.nextLine());

        System.out.print("Masukkan kecepatan : ");
        m1.setKecepatan(input.nextDouble());
        
        System.out.print("Masukkan waktu perjalanan dalam jam: ");
        m1.setWaktu(input.nextDouble());
        input.nextLine(); 

        m1.displayMessage();
        System.out.println("================");

        Mobil m2 = new Mobil();
        System.out.println("Masukkan detail untuk mobil kedua:");
        System.out.print("Masukkan nomor plat: ");
        m2.setNoPlat(input.nextLine());

        System.out.print("Masukkan warna: ");
        m2.setWarna(input.nextLine());

        System.out.print("Masukkan manufaktur: ");
        m2.setManufaktur(input.nextLine());

        System.out.print("Masukkan kecepatan : ");
        m2.setKecepatan(input.nextDouble());

        System.out.print("Masukkan waktu perjalanan dalam jam: ");
        m2.setWaktu(input.nextDouble());
        input.nextLine(); 

        m2.displayMessage();
        System.out.println("================");

        System.out.println("Mengubah warna mobil pertama menjadi hijau...");
        m1.setWarna("Hijau");
        m1.displayMessage();

        input.close();
    }
}





