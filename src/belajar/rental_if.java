package belajar;

import java.util.Scanner;

public class rental_if {
    public static void main(String[] aStrings) {
        final String toko = "RENTAL 88 MOBILINDO";
        final String alamat1 = "JL. Raya Bogor km. 77";
        final String alamat2 = "Jakarta Timur 15706";
        String namacos, jenis, driver;
        String tgl, kembali;
        int telat, mobil, paket, durasi;
        int subsewa, subdenda, subtotal, denda;

        Scanner keyboard = new Scanner(System.in);

        // input Data Customer
        System.out.println("=================== Data Customer ==================");

        System.out.println("Nama Customer \t\t : ");
        namacos = keyboard.nextLine();
        System.out.println("Tanggal Sewa (dd/mm/yy) : ");
        tgl = keyboard.next();
        System.out.println("Lama Sewa(hari) \t : ");
        durasi = keyboard.nextInt();
        System.out.println("Tanggal Kembali(dd/mm/yy) : ");
        kembali = keyboard.next();
        System.out.println("Tanggal Keterlambatan(Hari) : ");
        telat = keyboard.nextInt();
        System.out.println();

        // Input Data Kendraan
        System.out.println("=================== Data Kendaraan ==================");
        System.out.println("1.ALL New Avanza");
        System.out.println("2.Terios");
        System.out.println("3.Mitubishi Xpander");
        System.out.println(" ");
        System.out.println("Mobil Yang Disewa (1/2/3)");
        mobil = keyboard.nextInt();
        System.out.println(" ");

        System.out.println("=================== Tipe Paket ==================");
        System.out.println("1.Rental dengan Driver");
        System.out.println("2.Rental tanpa Driver");
        System.out.println("");
        System.out.print("Paket yang diambil (1/2/3) : ");
        paket = keyboard.nextInt();
        System.out.println(" ");

        // menentukan grade dan mutu rekayasa perangkat lunak
        if (mobil < 2) {
            if (paket < 2) {
                driver = "Rental Dengan Driver";
                jenis = "ALL New Avanza";
                mobil = 350000;
            } else {
                driver = "Rental Tanpa Driver";
                jenis = "ALL New Avanza";
                mobil = 250000;
            }
        } else if (mobil > 2) {
            if (paket < 2) {
                driver = "Rental Dengan Driver";
                jenis = "Mitubishi Xpander";
                mobil = 450000;
            } else {
                driver = "Rental Tanpa Driver";
                jenis = "Mitubishi Xpander";
                mobil = 400000;
            }
        } else {
            if (paket < 2) {
                driver = "Rental Tanpa Driver";
                jenis = "Terios";
                mobil = 400000;
            } else {
                driver = "Rental Tanpa Driver";
                jenis = "Terios";
                mobil = 350000;
            }
        }

        // Perhitungan sewa,total dan denda
        subsewa = mobil * durasi;
        denda = (mobil / 10);
        subdenda = telat * denda;
        subtotal = subsewa + subdenda;

        // Output
        System.out.println("");
        System.out.println("\f");
        System.out.println("I N V O I C E");
        System.out.println("");
        System.out.println("");
        System.out.println(toko);
        System.out.println(alamat1);
        System.out.println(alamat2);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|  TANGGAL           |  KETERANGAN      |             SUBTOTAL       |");
        System.out.println("--------------------------------------------------------------------  ");
        System.out.println("|  " + kembali + "      | Nama Penyewa :   |          " + namacos + "   |");
        System.out.println("|        Jenis Mobil :  |  " + jenis + "                                |");
        System.out.println("|          Paket :      |  " + driver + "                               |");
        System.out.println("|                    |                  |                            |");
        System.out.println("|      Tanggal Sewa  =  |   " + tgl + "                                 |");
        System.out.println("|       Durasi(hari) =  |  " + durasi + "  |          " + subsewa + "   |");
        System.out.println("|      Biaya Perhari =  |   " + mobil + "                              |");
        System.out.println("|                    |                  |                            |");
        System.out.println("|    Tanggal Kembali =  |  " + kembali + "                              |");
        System.out.println("| Keterlambatan(hari) = |" + telat + "     |         " + subdenda + "   |");
        System.out.println("|     Denda =           |  " + denda + "                                |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|        Total          | " + subtotal + " |                            |");
        System.out.println("======================================================================");
        System.out.println("");
        System.out.println("");
    }
}
