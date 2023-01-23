package belajar;

import java.util.Scanner;

public class latihan_uap3 {
    public static void main(String[] args) {
        int pilih = 0, pilih1 = 0, pilih2 = 0, pilih3 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("           RA.Al-Karomah Bogor           ");
        System.out.println("Silahkan Pilih bayaran yang ingin dibayar");
        System.out.println("1). PENGEMBANGAN");
        System.out.println("2). SPP");
        System.out.println("3). KEGIATAN");
        System.out.println("4). RAPORT");
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Apakah Ingin Membayar PENGMBANGAN (pilih 1 jika ya, pilih 2 jika tidak) : ");
        pilih = sc.nextInt();
        System.out.print("Apakah Ingin Membayar SPP (pilih 1 jika ya, pilih 2 jika tidak) : ");
        pilih1 = sc.nextInt();
        System.out.print("Apakah Ingin Membayar UANG KEGIATAN (pilih 1 jika ya, pilih 2 jika tidak) : ");
        pilih2 = sc.nextInt();
        System.out.print("Apakah Ingin Membayar RAPORT (pilih 1 jika ya, pilih 2 jika tidak) : ");
        pilih3 = sc.nextInt();
        System.out.println("------------------------------------------------------------------------");

        if (pilih == 1 && pilih1 == 1 && pilih2 == 1 && pilih3 == 1) {
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 8200000");
        } else if (pilih == 1 && pilih1 == 1 && pilih2 == 2 && pilih3 == 1) {
            System.out.println("uang kegiatan belum Rp.3.500.000");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 4700000");
        } else if (pilih == 1 && pilih1 == 1 && pilih2 == 1 && pilih3 == 2) {
            System.out.println("uang raport belum Rp.500.000");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 7700000");
        } else if (pilih == 1 && pilih1 == 1 && pilih2 == 2 && pilih3 == 2) {
            System.out.println("uang kegiatan Rp.3.500.000 dan uang raport Rp.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 4500000");
        }

        if (pilih == 2 && pilih1 == 1 && pilih2 == 1 && pilih3 == 1) {
            System.out.println("uang pengembangan belum Rp.3.000.000");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 5200000");
        } else if (pilih == 2 && pilih1 == 1 && pilih2 == 2 && pilih3 == 1) {
            System.out.println("uang pengembangan Rp.3.000.000 dan uang kegiatan Rp.3.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp.1.700.000");
        } else if (pilih == 2 && pilih1 == 1 && pilih2 == 1 && pilih3 == 2) {
            System.out.println("uang pengembangan Rp.3.000.000 dan raport Rp.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 4700000");
        } else if (pilih == 2 && pilih1 == 1 && pilih2 == 2 && pilih3 == 2) {
            System.out.println(
                    "uang pengembangan Rp.3.000.000 , kegiatan Rp.3.500.000 dan raport Rp.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 1200000");
        }

        if (pilih == 1 && pilih1 == 2 && pilih2 == 2 && pilih3 == 1) {
            System.out.println("uang spp Rp.1.200.000 dan uang kegiatan Rp.3.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 3500000");
        } else if (pilih == 1 && pilih1 == 2 && pilih2 == 1 && pilih3 == 1) {
            System.out.println("uang spp Rp.1.200.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 7000000");
        } else if (pilih == 1 && pilih1 == 1 && pilih2 == 1 && pilih3 == 1) {
            System.out.println("uang spp Rp.1.200.000 dan uang raport Rp.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 6500000");
        } else if (pilih == 1 && pilih1 == 1 && pilih2 == 1 && pilih3 == 1) {
            System.out.println(
                    "uang spp Rp.1.200.000 , uang kegiatan Rp.3.500.000 dan raport Rp.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 3000000");
        }

        if (pilih == 2 && pilih1 == 2 && pilih2 == 1 && pilih3 == 1) {
            System.out.println("Uang pengembangan Rp.3.000.000 dan spp Rp.1.200.000 belum dibayarkan ");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 4000000");
        } else if (pilih == 2 && pilih1 == 2 && pilih2 == 2 && pilih3 == 1) {
            System.out.println(
                    "uang pengembangan Rp.3.000.000,spp Rp.1.200.000 dan kegiatan Rp.3.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 500000");
        } else if (pilih == 1 && pilih1 == 1 && pilih2 == 1 && pilih3 == 1) {
            System.out
                    .println("uang pengembangan Rp.3.000.000,spp Rp.1.200.000 dan raport Rp.500.000 belum dibayarkan");
            System.out.println("TOTAL YANG SUDAH DIBAYARKAN = Rp. 3500000");
        } else if (pilih == 2 && pilih1 == 2 && pilih2 == 2 && pilih3 == 2) {
            System.out.println("uang pengembangan , spp, kegiatan dan raport belum HARAP LUNASI SEGERA !!!! ");
        }
    }
}
