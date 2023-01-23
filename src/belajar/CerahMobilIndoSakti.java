package belajar;

import java.util.Scanner;

public class CerahMobilIndoSakti {
    public static void main(String[] args) {

        final String toko = ("------------------ CERAH MOBIL SAKTI-------------");
        String pagar = ("#######################################################");
        String garis = ("-------------------------------------");
        String toyota = ("1/ Toyota Avanza");
        String honda = ("2/ Honda CRV");
        String pajero = ("3/ Mitsubishi Pajero");
        String ertiga = ("4/ Suzuki Ertiga");
        int dp, bulan, mobil, harga;
        int total_harga, cicilan, diskon;
        String jenis = ("");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("===================    SEDIA   ==================");
        System.out.println("1.Toyota Avanza");
        System.out.println("2.Honda CRV");
        System.out.println("3.Mitubishi Pajero");
        System.out.println("3.Suzuki Ertiga");
        System.out.println(" ");
        System.out.println("Pilih Mobil Yang Ingin DI Beli");
        mobil = keyboard.nextInt();
        System.out.println(" ");

        System.out.print("Pilih DP anda (min 25jt:) = ");
        dp = keyboard.nextInt();
        System.out.print("Pilih jumlah bulan yang anda inginkan : ");
        bulan = keyboard.nextInt();
        System.out.println(garis);

        if (mobil < 2) {
            if (bulan > 36) {
                harga = 260000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Toyota Avanza";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + bulan + "");
            } else {
                harga = 260000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                diskon = harga - 1000000;
                jenis = "Toyota Avanza";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = diskon - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            }
        } else if (mobil == 2) {
            if (bulan > 36) {
                harga = 342000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Honda CRV";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            } else {
                harga = 342000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Honda CRV";
                System.out.println("Nama Kendaraan = " + jenis + "");
                diskon = harga - 10000000;
                total_harga = diskon - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            }
        } else if (mobil > 2) {
            if (bulan > 36) {
                harga = 532000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Mitsubishi Pajero";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            } else {
                harga = 532000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Mitsubishi Pajero";
                System.out.println("Nama Kendaraan = " + jenis + "");
                diskon = harga - 10000000;
                total_harga = diskon - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            }
        } else if (mobil < 5) {
            if (bulan > 36) {
                harga = 275000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Suzuki Ertiga";
                System.out.println("Nama Kendaraan = " + jenis + "");
                total_harga = harga - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            } else {
                harga = 275000000;
                System.out.println("Harga Kendaraan = " + harga + "");
                jenis = "Suzuki Ertiga";
                System.out.println("Nama Kendaraan = " + jenis + "");
                diskon = harga - 10000000;
                total_harga = diskon - dp;
                System.out.println("Harga setelah di diskon = " + total_harga + "");
                cicilan = total_harga / bulan;
                System.out.println("Cicialn perbulan adalah = " + cicilan + "");
            }
        }

        System.out.println(garis);
        System.out.println("Jumlah bulan " + bulan + "");
        System.out.println(garis);

    }

}
