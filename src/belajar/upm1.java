package belajar;
import java.util.Scanner;


public class upm1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int angka,hasil,hasil2;
        int i = 0;

        System.out.print("input sebuah angka = ");
        angka = inputUser.nextInt();

        System.out.print("======================");

        while(i < 10){
            i++;
            hasil = angka/i;
            hasil2 = angka%i;
            System.out.println(angka + ":"+i+"= "+hasil+" sisa "+hasil2);
        }
    }
}
