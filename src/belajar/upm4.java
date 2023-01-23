package belajar;
import java.util.Scanner;

public class upm4 {
    public static void main(String args[]){
        Scanner masukan = new Scanner(System.in);
        int jlhbaris, jlhkolom;

        System.out.print("Input jumlah baris : ");
        jlhbaris = masukan.nextInt();
        jlhbaris = Math.abs(jlhbaris);

        System.out.print("Input jumlah kolom : ");
        jlhkolom = masukan.nextInt();
        jlhkolom = Math.abs(jlhkolom);
        
        int awalbaris, awalkolom;
        awalbaris = 1;
        while(awalbaris <= jlhbaris){
            awalkolom = 1;
            while(awalkolom <= jlhkolom){
                if(awalbaris % 2 == 0){
                    if(awalkolom % 2 == 1){
                        System.out.print("O ");
                    } else{
                        System.out.print("X ");
                    }
                } else{
                    if(awalkolom % 2 == 1){
                        System.out.print("X ");
                    } else{
                        System.out.print("O ");
                    }
                }
                awalkolom++;
            }
            awalbaris++;
            System.out.println();
        }
    }
}
