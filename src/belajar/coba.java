package belajar;

import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        final String nm_toko = "Toko sumber rezeki";
        final String alamat1 = "JL. Raya tengah No.80 Kel.Gedong";
        final String alamat2 = "kec. Pasar Rebo - Jakarta Timur";
        String garis = ("------------------------------------------------------------------------");
        int diskon, total_brg1, total_brg2, subtotal, ppn, total_qty, total, kembali;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("===================    Status Kategori    ==================");
        System.out.println("1. Tidak Kawin");
        System.out.println("2. Kawin");
        System.out.println(" ");
        System.out.println("Input status kategori = ");
        int qty1 = keyboard.nextInt();
        System.out.print("Masukan pendapatan anda dalam 1 tahun: ");
        int harga1 = keyboard.nextInt();

        System.out.println();

        total_brg1 = qty1 + harga1;
        subtotal = total_brg1;

        if (subtotal >= 70000000) {
            ppn = (subtotal * 5) / 100;
            total = subtotal + ppn;
            System.out.println("Pajak anda adalah sebesar Rp." + total);
        } else if (subtotal >= 50000000) {
            ppn = (subtotal * 5) / 100;
            total = subtotal + ppn;
            System.out.println("Pajak anda adalah sebesar Rp." + total);
        } else if (subtotal >= 270000000) {
            ppn = (subtotal * 5) / 100;
            total = subtotal + ppn;
            System.out.println("Pajak anda adalah sebesar Rp." + total);
        } else if (subtotal >= 250000000) {
            ppn = (subtotal * 5) / 100;
            total = subtotal + ppn;
            System.out.println("Pajak anda adalah sebesar Rp." + total);
        } else if (subtotal < 270000000) {
            ppn = (subtotal * 5) / 100;
            total = subtotal + ppn;
            System.out.println("Pajak anda adalah sebesar Rp." + total);
        } else if (subtotal < 250000000) {
            ppn = (subtotal * 5) / 100;
            total = subtotal + ppn;
            System.out.println(" Pajak anda adalah sebesar Rp." + total);
        }

    }
}
