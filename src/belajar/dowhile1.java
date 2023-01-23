package belajar;

import java.util.Scanner;

public class dowhile1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Scanner bilangan = new Scanner(System.in);
        int ganjil, awal, akhir, jumlah = 0;
        System.out.print("Masukkan Nilai Awal : ");
        awal = bilangan.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        akhir = bilangan.nextInt();
        System.out.print("Deret Bilangan Ganjilnya = ");
        ganjil = awal;
        do {
            if (ganjil % 2 == 1) {
                jumlah = jumlah + ganjil;
                System.out.print(ganjil + " ");
            }
            ganjil++;
        } while (ganjil <= akhir);

        System.out.println();
        System.out.println("Jumlah Deret Bilangan Ganjil Adalah = " + jumlah + " ");
    }
}
