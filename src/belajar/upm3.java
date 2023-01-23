package belajar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class upm3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer angka,a1,a2;
        System.out.print('\u000C');
        System.out.print("Input Sebuah Angka : ");
        angka = Integer.parseInt(br.readLine());
        System.out.print("Angka - angka yang merupakan kelipatan 3 atau 5 kurang dari "+angka+" adalah : ");
        a1 = 0;
        a2 = 0;
        for(int i = 1;i< angka;i++){
            if(i%3 == 0){
                System.out.print(i+" ");
                if(i%2 == 0){
                    a1++;
                }else{
                    a2++;
                }
            }else if(i%5 == 0){
                System.out.print(i+" ");
                if(i%2 == 0){
                    a1++;
                }else{
                    a2++;
                }
            }
        }
        System.out.println();
        System.out.println("Jumlah angka genap : "+a1);
        System.out.println("Jumlah angka ganjil : "+a2);
    }
}
