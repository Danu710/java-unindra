package belajar;
import java.util.Scanner;

public class Ulangan_uap4 {
    public static void main(String[] args) {

        String garis = ("-------------------------------------");
        int tiket, kereta, harga;
        int total;
        String jenis = ("");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("===================    JENIS KELAS KERETA API   ==================");
        System.out.println("1.Ekonomi");
        System.out.println("2.Ekesutif");
        System.out.println(" ");
        System.out.println("Pilih Jenis Kelas");
        kereta = keyboard.nextInt();
        System.out.println(" ");

        System.out.print("Masukan Jumlah Penumpang ");
        tiket = keyboard.nextInt();
        System.out.println(garis);

        if (kereta < 2) {
            if (tiket > 5) {
                harga = 80000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Ekonomi";
                System.out.println("Jenis Kereta Api = " + jenis + "");
                total = (harga * tiket);
                System.out.println("TOTAL tarif tiket yang hraus dibayarkan adalah Rp. " + total + "");
            } else {
                harga = 100000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Ekonomi";
                System.out.println("Jenis Kereta Api = " + jenis + "");
                total = (harga * tiket);
                System.out.println("TOTAL tarif tiket yang hraus dibayarkan adalah Rp. " + total + "");
            }
        } else if (kereta == 2) {
            if (tiket > 5) {
                harga = 400000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Esekutif";
                System.out.println("Jenis Kereta Api = " + jenis + "");
                total = (harga * tiket);
                System.out.println("TOTAL tarif tiket yang hraus dibayarkan adalah Rp. " + total + "");
            } else {
                harga = 500000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Esekutif";
                System.out.println("Jenis Kereta Api = " + jenis + "");
                total = (harga * tiket);
                System.out.println("TOTAL tarif tiket yang hraus dibayarkan adalah Rp. " + total + "");

            }
        } 
    }
}
