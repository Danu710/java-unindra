package belajar;

import java.util.Scanner;

public class ifnested {
    public static void main(String[] args) {
        final String nm_toko = "Toko sumber rezeki";
        final String alamat1 = "JL. Raya tengah No.80 Kel.Gedong";
        final String alamat2 = "kec. Pasar Rebo - Jakarta Timur";
        String garis = ("------------------------------------------------------------------------");
        int diskon, total_brg1, total_brg2, subtotal, ppn, total_qty, total, kembali;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Nama barang pertama = ");
        String nbr1 = input1.nextLine();
        System.out.print("Jumlah pembelian barang pertama = ");
        int qty1 = input1.nextInt();
        System.out.print("Harga barang pertama = ");
        int harga1 = input1.nextInt();

        System.out.println();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Nama barang kedua   = ");
        String nbr2 = input2.nextLine();
        System.out.print("Jumlah pembelian barang kedua   = ");
        int qty2 = input2.nextInt();
        System.out.print("Harga barang kedua   = ");
        int harga2 = input2.nextInt();
        System.out.print("Jumlah uang yang diberikan = ");
        int bayar = input2.nextInt();

        total_brg1 = qty1 * harga1;
        total_brg2 = qty2 * harga2;
        subtotal = total_brg1 + total_brg2;
        ppn = (subtotal * 10) / 100;
        total_qty = qty1 + qty2;

        System.out.println();
        System.out.println(nm_toko);
        System.out.println(alamat1);
        System.out.println(alamat2);
        System.out.println(garis);
        System.out.println("Nama \t\t\t Qty \t\t Harga \t\t Total");
        System.out.println(garis);
        System.out.println(nbr1 + "\t" + qty1 + "\t\t" + harga1 + "\t\t" + total_brg1);
        System.out.println(nbr2 + "\t" + qty2 + "\t\t" + harga2 + "\t\t" + total_brg2);
        System.out.println(garis);
        System.out.println("Subtotal  : " + subtotal);
        System.out.println("PPN (10%) : " + ppn);
        System.out.println(garis);
        System.out.println("Total Qty : " + total_qty);

        if (subtotal >= 1000000) {
            diskon = (subtotal * 10) / 100;
            total = subtotal + ppn - diskon;
            kembali = bayar - total;
            System.out.println("Discount  : " + diskon);
            System.out.println("Total     : " + total);
            System.out.println("Bayar     : " + bayar);
            System.out.println("Kembali   : " + kembali);
        } else if (subtotal >= 700000) {
            diskon = (subtotal * 7) / 100;
            total = subtotal + ppn - diskon;
            kembali = bayar - total;
            System.out.println("Discount  : " + diskon);
            System.out.println("Total     : " + total);
            System.out.println("Bayar     : " + bayar);
            System.out.println("Kembali   : " + kembali);
        } else if (subtotal >= 500000) {
            diskon = (subtotal * 5) / 100;
            total = subtotal + ppn - diskon;
            kembali = bayar - total;
            System.out.println("Discount  : " + diskon);
            System.out.println("Total     : " + total);
            System.out.println("Bayar     : " + bayar);
            System.out.println("Kembali   : " + kembali);
        } else if (subtotal < 500000) {
            diskon = (subtotal * 3) / 100;
            total = subtotal + ppn - diskon;
            kembali = bayar - total;
            System.out.println("Discount  : " + diskon);
            System.out.println("Total     : " + total);
            System.out.println("Bayar     : " + bayar);
            System.out.println("Kembali   : " + kembali);
        }

        System.out.println("========================================================================");
        System.out.println();
        System.out.println("Barang yang sudah dibeli");
        System.out.println("TIDAK DAPAT DITUKAR ATAU DIKEMBALIKAN");
        System.out.println();
        System.out.println("----------------------------Terima Kasih--------------------------------");

    }
}
