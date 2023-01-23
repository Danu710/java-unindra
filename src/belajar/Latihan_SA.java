package belajar;

import java.util.InputMismatchException;
import java.util.*;

public class Latihan_SA {
    public static int inputKeyboard(int nilai) {
        Scanner sc = new Scanner(System.in);

        try {
            nilai = sc.nextInt();

            if (nilai >= 0 && nilai <= 100) {
                nilai = nilai;
            } else {
                System.out.println("Data yang Anda masukan salah! \n Harap masukan data bilangan (0-100)!");
                System.exit(1);
            }

        } catch (InputMismatchException e) {
            System.out.println("Data yang Anda masukan salah! \n Harap masukan data bilangan (0-100)!");
            System.exit(1);
        }
        return nilai;
    }

    public static void main(String[] aStrings) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        final String rpl = "Rekayasa Perangkat Lunak";
        final String ro = "Riset Operasional";
        final String kg = "Komputer Grafik";
        final String fi = "Filsafat Ilmu";

        int nilai = 0;

        System.out.println("Nama Mahasiswa : ");
        String nama = sc.nextLine();
        nama = String.format("%.20s", nama);

        System.out.println("NPM Mahasiswa : ");
        String npm = sc.nextLine();
        nama = String.format("%.12s", npm);

        System.out.println("Kelas Mahasiswa : ");
        String kelas = sc.nextLine();
        nama = String.format("%.3s", kelas);

        System.out.println();
        System.out.println("=================== DATA NILAI ==================");

        System.out.println("Nilai " + rpl + ":");
        nilai = inputKeyboard(nilai);
        int n_rpl = nilai;

        System.out.println("Nilai " + ro + ":");
        nilai = inputKeyboard(nilai);
        int n_ro = nilai;

        System.out.println("Nilai " + kg + ":");
        nilai = inputKeyboard(nilai);
        int n_kg = nilai;

        System.out.println("Nilai " + fi + ":");
        nilai = inputKeyboard(nilai);
        int n_fi = nilai;

        final String fakultas = "Teknik dan Ilmu komputer";
        final String prodi = "informatika";
        final String jenjang = "Strata Satu(S1)";
        final int sks_rpl = 3;
        final int sks_ro = 3;
        final int sks_kg = 3;
        final int sks_fi = 2;

        char grade_rpl, grade_ro, grade_kg, grade_fi;
        int mutu_rpl, mutu_ro, mutu_kg, mutu_fi;

        // menentukan grade dan mutu rekayasa perangkat lunak
        if (n_rpl >= 90 && n_rpl <= 100) {
            grade_rpl = 'A';
            mutu_rpl = 4;
        } else if (n_rpl >= 80 && n_rpl < 90) {
            grade_rpl = 'B';
            mutu_rpl = 3;
        } else if (n_rpl >= 70 && n_rpl < 80) {
            grade_rpl = 'C';
            mutu_rpl = 2;
        } else if (n_rpl >= 60 && n_rpl < 70) {
            grade_rpl = 'D';
            mutu_rpl = 1;
        } else {
            grade_rpl = 'E';
            mutu_rpl = 0;
        }

        // menentukan grade dan mutu riset operasional
        if (n_ro >= 90 && n_ro <= 100) {
            grade_ro = 'A';
            mutu_ro = 4;
        } else if (n_ro >= 80 && n_ro < 90) {
            grade_ro = 'B';
            mutu_ro = 3;
        } else if (n_ro >= 70 && n_ro < 80) {
            grade_ro = 'C';
            mutu_ro = 2;
        } else if (n_ro >= 60 && n_ro < 70) {
            grade_ro = 'D';
            mutu_ro = 1;
        } else {
            grade_ro = 'E';
            mutu_ro = 0;
        }

        // menentukan grade dan mutu komputer grafik
        if (n_kg >= 90 && n_kg <= 100) {
            grade_kg = 'A';
            mutu_kg = 4;
        } else if (n_kg >= 80 && n_kg < 90) {
            grade_kg = 'B';
            mutu_kg = 3;
        } else if (n_kg >= 70 && n_kg < 80) {
            grade_kg = 'C';
            mutu_kg = 2;
        } else if (n_kg >= 60 && n_kg < 70) {
            grade_kg = 'D';
            mutu_kg = 1;
        } else {
            grade_kg = 'E';
            mutu_kg = 0;
        }

        // menentukan grade dan mutu filsafat ilmu
        if (n_fi >= 90 && n_fi <= 100) {
            grade_fi = 'A';
            mutu_fi = 4;
        } else if (n_fi >= 80 && n_fi < 90) {
            grade_fi = 'B';
            mutu_fi = 3;
        } else if (n_fi >= 70 && n_fi < 80) {
            grade_fi = 'C';
            mutu_fi = 2;
        } else if (n_fi >= 60 && n_fi < 70) {
            grade_fi = 'D';
            mutu_fi = 1;
        } else {
            grade_fi = 'E';
            mutu_fi = 0;
        }

        System.out.println("\f              KARTU HASIL STUDY");
        // \f (form feed) menganti layar dengan layar baru
        System.out.println("            UNIVERSITAS INDRAPRASTA PGRI");
        System.out.println();
        System.out.println("Fakultas      : " + fakultas + "          " + "Nama Mahasiswa   : " + nama);
        System.out.println("Program Studi : " + prodi + "                       " + "NPM Mahasiswa   : " + npm);
        System.out.println("Jenjang       : " + jenjang);

        System.out.println("--------------------------");
        System.out.println("Mata Kuliah                  Kelas     SKS    Nilai     SKS x NILAI");
        System.out.println("--------------------------");

        double sxn_rpl = mutu_rpl * sks_rpl;// hitung (SKS x Nilai) RPL
        System.out
                .println(rpl + "      " + kelas + "       " + sks_rpl + "        " + grade_rpl + "        " + sxn_rpl);

        double sxn_ro = mutu_ro * sks_ro;// hitung (SKS x Nilai) RO
        System.out.println(
                ro + "             " + kelas + "       " + sks_ro + "        " + grade_ro + "        " + sxn_ro);

        double sxn_kg = mutu_kg * sks_kg;// hitung (SKS x Nilai) RO
        System.out.println(
                kg + "               " + kelas + "       " + sks_kg + "        " + grade_kg + "        " + sxn_kg);

        double sxn_fi = mutu_fi * sks_fi;// hitung (SKS x Nilai) RO
        System.out.println(
                fi + "                 " + kelas + "       " + sks_fi + "        " + grade_fi + "        " + sxn_fi);

        System.out.println("--------------------------");

        int jml_sks = sks_rpl + sks_ro + sks_kg + sks_fi;
        System.out.println("Jumlah SKS : " + jml_sks);

        double ip = ((sxn_rpl + sxn_ro + sxn_kg + sxn_fi) / jml_sks);

        System.out.println("Indeks Prestasi : " + String.format("%.2f", ip));

        System.out.println("--------------------------");

        sc.close();

    }
}
