package belajar;

import java.util.Scanner;

public class TokoAccessories {

    public static void main(String[] aStrings) {
        final String nm_toko = "TOKO Accessories PRIA: -MANLY ACCESSORIES-";
        String garis = ("------------------------------------------------------------------------");
        String namacos, jenis;
        String tgl, kembali;
        int durasi, harga;
        int subsewa, subtotal, denda;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("=================== Data Customer ==================");

        System.out.println("Nama Pembeli \t : ");
        namacos = keyboard.nextLine();
        System.out.println("Kode Barang \t :");
        tgl = keyboard.next();
        System.out.println("Jumlah \t : ");
        durasi = keyboard.nextInt();
        System.out.println();

        System.out.println("=================== Data Barang ==================");
        System.out.println("1.Sepatu");
        System.out.println("2.Sandal");
        System.out.println("3.Topi");
        System.out.println(" ");
        System.out.println("pilih (1/2/3)");
        harga = keyboard.nextInt();
        System.out.println(" ");

        if (harga < 2) {
            jenis = "Sepatu";
            harga = 300000;
        } else if (harga > 2) {
            jenis = "Sandal";
            harga = 150000;
        } else {
            jenis = "Topi";
            harga = 250000;
        }

        // Perhitungan sewa,total dan denda
        subsewa = harga * durasi;
        denda = (harga / 10);
        subtotal = subsewa;

        // Output
        System.out.println("");
        System.out.println("\f");
        System.out.println("I N V O I C E");
        System.out.println("");
        System.out.println("");
        System.out.println(nm_toko);
        System.out.println("--------------------------------------------------------");
        System.out.println("|       |  Pembeli :          " + namacos + "              ");
        System.out.println("|       |  NamaBarang :       " + jenis + "                ");
        System.out.println("|       |  Harga  Barang :    " + harga + "                ");
        System.out.println("|       |  Jumlah   Barang:   " + durasi + "               ");
        System.out.println("--------------------------------------------------------");
        System.out.println("|       |  Total:             " + subtotal + "             ");
        System.out.println("========================================================");
        System.out.println("");
        System.out.println("");
    }

}
