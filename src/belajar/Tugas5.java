package belajar;

public class Tugas5 {
    public static void main(String[] args) {
        final String nama_toko = "Toko Sumber Rejeki";
        final String alamat1 = "Jl. Raya tengah No.80 Kel.Gedong";
        final String alamat2 = "Kec Pasar Rebo - Jakarta Timur";
        final Double margin = 0.2;
        String Garis = ("====================================================");
        String garis = ("----------------------------------------------------");
        String terimakasih = ("-------------------------TERIMAKASIH-------------------");

        String nm_brg1 = "Philip Rice Cooker";
        int qty1 = 1;
        int harga1 = 649000;
        int total_brg1 = qty1 * harga1;

        String nm_brg2 = "Philip Vacuum Cleaner";
        int qty2 = 3;
        int harga2 = 264000;
        int total_brg2 = qty2 * harga2;

        int subtotal = total_brg1 + total_brg2;
        int ppn = (subtotal * 10) / 100;
        int total_qty = qty1 + qty2;
        int total = subtotal / 10 * 10;
        int bayar = 1500000;
        int kembali = 59000;

        System.out.println(nama_toko);
        System.out.println(nm_brg1);
        System.out.println(nm_brg2);
        System.out.println(Garis);
        System.out.println("Nama \t\t\t Qty \t\t Harga \t\t Total");
        System.out.println(Garis);
        System.out.println(nm_brg1 + "\t" + qty1 + "\t\t" + harga1 + "\t\t" + total_brg1);
        System.out.println(nm_brg2 + "\t" + qty2 + "\t\t" + harga2 + "\t\t" + total_brg2);
        System.out.println(Garis);
        System.out.println("Subtotal : " + subtotal);
        System.out.println("PPN (10%) : " + ppn);
        System.out.println(Garis);
        System.out.println("Total Qty :" + total_qty);
        System.out.println("Total :" + total);
        System.out.println("Bayar :" + bayar);
        System.out.println("Kembali : " + kembali);
        System.out.println(Garis);
        System.out.println();
        System.out.println("Barang Yang Sudah Dibeli");
        System.out.println("Tidak Dapat DITUKAR atau DIKEMBALIKAN");
        System.out.println(Garis);
        System.out.println(terimakasih);
    }
}
