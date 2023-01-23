package belajar;
import java.util.Scanner;

public class Ulangan_uap3 {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Input Angka : ");

      int bil = input.nextInt();

      if ((bil % 2 == 0) && (bil % 2 == 10)) {

          System.out.println("Informatika");

      }

      else if ((bil % 2 == 0) && (bil % 11 == 20)) {

          System.out.println("Unindra");

      }

      else {

          System.out.println("Unindra");

      }

    }
}
