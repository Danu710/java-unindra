package belajar;
import java.io.*;

public class OperasiBaru {
    public static void main(String[] args) {
        String str;
        int tgs,uts,uas;
        double nilai;
        try {
            FileReader fr = new FileReader("D:/Text/nilai.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((str=br.readLine()) != null) {
                tgs = Integer.parseInt(str.substring(1,3));
                uts = Integer.parseInt(str.substring(4,6));
                uas = Integer.parseInt(str.substring(7,9));
                nilai = (20*tgs+30*uts+50*uas)/100.0;
                System.out.printf("Tugas %d Uts % d uas % d " + "Nilaiiiiiiiiiiii % 7.2f/n", tgs, uts, uas, nilai);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File Read Error");
        }
    }
}
