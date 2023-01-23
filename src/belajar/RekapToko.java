package belajar;

public class RekapToko {
    public static void main(String[] args) {
        // konstanta
        final String nama_toko = "Sumber Rejeki";
        final Double margin = 0.2;

        // variabel
        String garis = ("============================");

        int omset_hari1 = 300000;
        double hpp_hari1 = omset_hari1 - (omset_hari1 * margin);

        int omset_hari2 = 150000;
        double hpp_hari2 = omset_hari1 - (omset_hari2 * margin);

        int omset_hari3 = 250000;
        double hpp_hari3 = omset_hari1 - (omset_hari3 * margin);

        int omset_hari4 = 350000;
        double hpp_hari4 = omset_hari1 - (omset_hari4 * margin);

        int omset_hari5 = 200000;
        double hpp_hari5 = omset_hari1 - (omset_hari5 * margin);

        int omset_total = omset_hari1 + omset_hari2 + omset_hari3 + omset_hari4 + omset_hari5;
        double hpp_total = hpp_hari1 + hpp_hari2 + hpp_hari3 + hpp_hari4 + hpp_hari5;

        double margin_bersih = omset_total - hpp_total;
        int omset_average = omset_total / 5;

        System.out.println("Rekap Pendapatan Toko : " + nama_toko);
        System.out.print(garis);

        System.out.println("keterangan \t\t Hari 1 \t Hari 2\t Hari 3\t Hari 4\t Hari 5 \t Total");
        System.out.println("Omset : \t\t" + omset_hari1 + "\t\t" + omset_hari2 + "\t\t" + omset_hari3 + "\t\t"
                + omset_hari4 + "\t\t" + omset_hari5 + "\t\t" + omset_total + "\t\t");
        System.out.print("HPP : \t\t" + hpp_hari1 + "\t" + hpp_hari2 + "\t" + hpp_hari3 + "\t" + hpp_hari4 + "\t"
                + hpp_hari5 + "\t");

        System.out.println("");
        System.out.println("Margin Bersih : " + margin_bersih);
        System.out.print("Omset Rata-rata : " + omset_average);

    }
}
