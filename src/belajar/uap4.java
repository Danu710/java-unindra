package belajar;

import java.util.Scanner;

public class uap4 {
    public static void main(String[] args) {
        final String toko = ("------------------ CERAH MOBIL SAKTI-------------");
        int dp, bulan, mobil, harga, ppn, total;
        int total_harga, cicilan, diskon;
        String jenis = ("");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("===================    Status Kategori    ==================");
        System.out.println("1. Tidak Kawin");
        System.out.println("2. Kawin");
        System.out.println(" ");
        System.out.println("Input status kategori = ");
        mobil = keyboard.nextInt();
        System.out.println(" ");

        System.out.print("Masukan pendapatan anda dalam 1 tahun = ");
        dp = keyboard.nextInt();

        if (dp >= 70000000) {
            ppn = (mobil * 5) / 100;
            total = dp - ppn;
            System.out.println("Total     : " + total);
        } else if (dp >= 50000000) {
            ppn = (mobil * 5) / 100;
            total = dp - ppn;
            System.out.println("Total     : " + total);
        } else if (dp >= 270000000) {
            ppn = (mobil * 15) / 100;
            total = dp - ppn;
            System.out.println("Total     : " + total);
        } else if (dp >= 250000000) {
            ppn = (mobil * 15) / 100;
            total = dp - ppn;
            System.out.println("Total     : " + total);
        } else if (dp > 270000000) {
            ppn = (mobil * 25) / 100;
            total = dp - ppn;
            System.out.println("Total     : " + total);
        } else if (dp > 250000000) {
            ppn = (mobil * 25) / 100;
            total = dp - ppn;
            System.out.println("Total     : " + total);
        }

    }
}
