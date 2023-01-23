package belajar;
import java.io.*;
import java.io.FileReader;


public class BacaFile {
    public static void main(String[]args){
        try {
            
            File file = new File("harga.txt");
            FileInputStream fs = new FileInputStream(file);
            DataInputStream di = new DataInputStream((fs));

            while (di.available() != 0) {
                String data = di.readLine();
                System.out.println(data);
            }
            di.close();
        } catch (Exception e) {
            {System.out.println("Ada Kesalahan :" +e.getMessage());}        }
    }
}
