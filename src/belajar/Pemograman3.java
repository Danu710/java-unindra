package belajar;
import java.io.*;

public class Pemograman3 {
    public static void main (String [] args){
        try{
            FileOutputStream out = new FileOutputStream("D:/Text/Harga.txt");
            PrintStream p = new PrintStream(out);
            p.println("P2618317|2|Bagus Saputra");
            p.println("P5372883|1|Radika Utama");
            p.println("P2663284|4|Diva Mutiara");
            p.println("P8423089|3|Nazwa Fauzia");
            p.println("P9012715|1|Batara Wirya");
            p.println("P8324920|4|Aruna Zahira");
            p.close();
        }
        catch(Exception e){System.out.println("Kesalahan :"+e.getMessage());}
        System.out.println("Tulis ke file berhasil");
    }
    
}
