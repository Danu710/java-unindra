package belajar;
import java.util.Scanner;

public class upm5 {
    public static void main(String[] args) {

        // membuat array angka
        String[] angka = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < angka.length; i++ ){
            System.out.print("Input bilangan ke-" + i + ": ");
            angka[i] = scan.nextLine();
        }

        System.out.println("===============================");
        System.out.println("Data Yang Di input adalah");

        // menampilkan semua isi array
        for( String b : angka ){
            System.out.println(b);
        }

    }
}
