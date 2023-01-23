package belajar;
import java.util.Scanner;

public class Array3dimensi {
    public static void main(String[] args) {
        Scanner fa=new Scanner (System.in);
       
       System.out.print("Jumlah Data : "); int jdata=fa.nextInt();
       
       String data [] [] = new String [jdata] [3];
       
       for (int i=0;i<jdata ;i++ ) {
           System.out.print("Mata Kuliah    :"); data[i][0]=fa.next();
           System.out.print("Nilai Teori    :"); data[i][1]=fa.next();
           System.out.print("Mata Praktikum    :"); data[i][2]=fa.next();
       }
       
       System.out.println("-----------------------------------------");
       System.out.println("Mata Kuliah/Teori/ Praktikum /Rata-Rata");
       System.out.println("-----------------------------------------");
       for (int i=0;i<jdata ;i++ ){
           
            float newData1 = Float.parseFloat(data [i] [1]);
           float newData2 = Float.parseFloat(data [i] [2]);
           System.out.print (data [i] [0]+"\t"+data [i] [1]+"\t"+data [i] [2]+"\t"+ ((newData1 + newData2 )/ 2 ) );
           System.out.println ();
       } 
   }
}
