package belajar;
import java.io.*;

public class OperasiTeks2 {
    public static void main(String[] args) {
       
        try {
            FileWriter fw = new FileWriter("D:/Text/cobaFile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Baris kesatu"+"\n");
            bw.write("Baris Kedua"+"\n");
            bw.write("Baris Ketiga"+"\n");
            bw.write("Baris Keempat"+"\n");
            bw.close();
        } catch (IOException e) {
            System.err.println("File Read Error");
        }
    }
}
