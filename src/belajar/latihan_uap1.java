package belajar;

import java.util.Scanner;

public class latihan_uap1 {
    public static void main(String[] args) {
        final String nm_toko = "=== PERHITUNGAN Penjualan Baju Gamis ( Selama Ramadhan 1441 H ) - GAMIS FASHION ===";
        int total_brg1, subtotal, total, kembali;

        Scanner input1 = new Scanner(System.in);

        System.out.println(nm_toko);
        System.out.print("Silahkan input Jumlah Penjualan Baju Gamis Minggu Pertama = ");
        int qty1 = input1.nextInt();
        System.out.println("========================================================================");
        System.out.print("Silahkan input Jumlah Penjualan Baju Gamis Sampai Minggu Terakhir = ");
        int harga1 = input1.nextInt();
        System.out.println("========================================================================");

        total_brg1 = qty1 + harga1;
        subtotal = total_brg1;
        System.out.println("Total Penjualan Adalah " + subtotal);

        if (subtotal == 100) {
            System.out.println("Anda Mencapai Target Penjualan Sebulan  : " + subtotal);
            total = subtotal * 80000;
            kembali = subtotal * 70000;
            System.out.println("Dengan rincian Harga Modal Rp.80.000, Dijual Rp.150.000 ");
            System.out.println("MODAL    : " + total);
            System.out.println("KEUNTUNGAN  : " + kembali);
        } else if (subtotal < 100) {
            System.out.println("Anda Tidak Mencapai Target Penjualan Sebulan  : " + subtotal);
            total = subtotal * 80000;
            kembali = subtotal * 70000;
            System.out.println("Dengan rincian Harga Modal Rp.80.000, Dijual Rp.150.000 ");
            System.out.println("MODAL    : " + total);
            System.out.println("KEUNTUNGAN   : " + kembali);
        } else if (subtotal > 100) {
            System.out.println("Anda Melebihi Mencapai Target Penjualan Sebulan  : " + subtotal);
            total = subtotal * 80000;
            kembali = subtotal * 70000;
            System.out.println("Dengan rincian Harga Modal Rp.80.000, Dijual Rp.150.000 ");
            System.out.println("MODAL     : " + total);
            System.out.println("KEUNTUNGAN   : " + kembali);
        }
    }
}
