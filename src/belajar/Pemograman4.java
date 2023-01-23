package belajar;
import java.io.*;

public class Pemograman4 {
    public static void main(String[] args) {

        try {
            FileInputStream fs = new FileInputStream("D:/Text/Harga.txt");
            DataInputStream di = new DataInputStream(fs);
             System.out.println("ID Pegawai\t\t"+"Golongan\t\t" + "Nama\t\t" + "gapok\t\t" + "tujangan\t\t"+"total gaji");
            // System.out.println("ID Pegawai\tGolongan\tNama\tGapok\tTunjangan\tTotal Gaji");
            // System.out.println("ID Pegawai\t" + "Golongan\t" + "Nama\t" + "gapok\t" + "tujangan\t" + "total gagji\t");
            System.out.println("===================================================================================================================");
            

            while (di.available() != 0) {
                String data = di.readLine();
                String id = data.substring(0, 8);
                String golongan = data.substring(9, 10);
                String nama = data.substring(11, data.length());
                int gapok, tunjangan, totalgaji;
                if (Integer.parseInt(golongan) == 1) {
                    gapok = 3000000;
                    tunjangan = gapok * 5 / 100;
                } else if (Integer.parseInt(golongan) == 2) {
                    gapok = 4500000;
                    tunjangan = gapok * 10 / 100;
                } else if (Integer.parseInt(golongan) == 3) {
                    gapok = 6000000;
                    tunjangan = gapok * 15 / 100;
                } else {
                    gapok = 8000000;
                    tunjangan = gapok * 20 / 100;
                }
                totalgaji = gapok + tunjangan;

               
             
                System.out.println(id+"\t\t"+golongan+"\t\t"+nama+"\t\t"+gapok+"\t\t"+tunjangan+"\t\t\t"+totalgaji);
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            di.close();

        } catch (Exception e) {
            System.out.println("Ada kesalahan" + e.getMessage());
        }
    }
}
