package belajar;
import java.util.Scanner;

public class upm2 {
  public static void main(String args[]){
    Scanner masukan = new Scanner(System.in);
    int inputan;

    System.out.print("Input Sebuah angka : ");
    inputan = masukan.nextInt();

    inputan = Math.abs(inputan);

    if(inputan > 0){
      int mulai = 1;
      System.out.println("Angka yang dapat membagi " + inputan + " tanpa sisa adalah:");
      do{
      int sisa = inputan % mulai;
    if(sisa == 0){
      System.out.print(mulai);
    if(mulai <= inputan - 1)
      System.out.print(",");
    }mulai += 1;
    }while(mulai <= inputan);
    }
    else{
    System.out.println("Angka yang Anda masukkan belum tepat. Silahkan running kembali program ini");
    }
  }
}
