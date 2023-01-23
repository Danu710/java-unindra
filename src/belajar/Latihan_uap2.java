package belajar;

import java.util.Scanner;

public class Latihan_uap2 {
    public static void main(String[] args) {

        String garis = ("-------------------------------------");
        int tiket, pesawat, harga;
        int total_harga, total, diskon;
        String jenis = ("");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("===================    BELITIKET DOT COM   ==================");
        System.out.println("1.Garuda");
        System.out.println("2.Lion");
        System.out.println("3.Citilink");
        System.out.println(" ");
        System.out.println("Silahkan Pilih Pesawat Anda");
        pesawat = keyboard.nextInt();
        System.out.println(" ");

        System.out.print("Masukan Jumlah Tiket Yang Ingin Dibeli ");
        tiket = keyboard.nextInt();
        System.out.println(garis);

        if (pesawat < 2) {
            if (tiket >= 100) {
                harga = 400000;
                System.out.println("Harga Tiket = " + harga + "");
                diskon = harga - 200000;
                jenis = "Garuda-Diskon 50%";
                System.out.println("Nama Pesawat = " + jenis + "");
                total_harga = diskon;
                System.out.println("DISKON = " + total_harga + "");
                total = (harga - diskon) * tiket;
                System.out.println("TOTAL = " + total + "");
            } else {
                harga = 400000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Garuda";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga;
                System.out.println("DISKON = " + total_harga + "");
                total = total_harga * tiket;
                System.out.println("TOTAL = " + total + "");

            }
        } else if (pesawat == 2) {
            if (tiket >= 100) {
                harga = 200000;
                System.out.println("Harga Tiket = " + harga + "");
                diskon = harga - 100000;
                jenis = "Lion-Diskon 50%";
                System.out.println("Nama Pesawat = " + jenis + "");
                total_harga = diskon;
                System.out.println("DISKON = " + total_harga + "");
                total = (harga - diskon) * tiket;
                System.out.println("TOTAL = " + total + "");
            } else {
                harga = 200000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Lion";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga;
                System.out.println("DISKON = " + total_harga + "");
                total = total_harga * tiket;
                System.out.println("TOTAL = " + total + "");

            }
        } else if (pesawat > 2) {
            if (tiket >= 100) {
                harga = 300000;
                System.out.println("Harga Tiket = " + harga + "");
                diskon = harga - 150000;
                jenis = "Citilink-Diskon 50%";
                System.out.println("Nama Pesawat = " + jenis + "");
                total_harga = diskon;
                System.out.println("DISKON = " + total_harga + "");
                total = (harga - diskon) * tiket;
                System.out.println("TOTAL = " + total + "");
            } else {
                harga = 300000;
                System.out.println("Harga Tiket = " + harga + "");
                jenis = "Citilink";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga;
                System.out.println("DISKON = " + total_harga + "");
                total = total_harga * tiket;
                System.out.println("TOTAL = " + total + "");
            }
        }

    }
}
