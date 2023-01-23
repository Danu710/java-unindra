package belajar;
import java.util.Scanner;

public class Pemograman1 {
    public static void main(String[] args)
    {
        String nama, tanggal;
        Scanner fa = new Scanner (System.in);
        float  bmi;
    
        
        System.out.print("Tanggal : "); tanggal = fa.nextLine();
        System.out.print("Dokter : "); nama = fa.nextLine();
        System.out.println();
        System.out.print("Jumlah Data : "); int n=fa.nextInt();
        System.out.println("============================================================");
        
        String data[][] = new String[n][3];

        for(int i= 0; i<n; i++)
        {
            System.out.print("ID Pasien           :"); data[i][0]=fa.next();
            System.out.print("Berat Badan (kg)    :"); data[i][1]=fa.next();
            System.out.print("Tinggi Badan (cm)   :"); data[i][2]=fa.next(); 
             
            System.out.println();
        }
       
        System.out.println("==============================================================");
        System.out.println("                       KLINIK GIZI                            ");
        System.out.println("--------------------------------------------------------------");
        System.out.println(   "Dokter : " + nama +    "\t\t\t\t"          +"Tanggal : "+ tanggal); 
        System.out.println("==============================================================");
        System.out.println("ID\tBerat Badan\tTinggi Badan\tBMI\t\tStatus");
        System.out.println("==============================================================");
        
        for (int i=0;i<n ;i++ ){ 
            Float newData1 = Float.parseFloat(data [i] [1]);
            float newData2 = Float.parseFloat(data [i] [2]);
      
        bmi = (newData1/(newData2 / 100 * newData2 / 100));
        
        System.out.print (data [i][0]+"\t"+data [i][1]+"\t\t"+data [i][2]+"\t\t"+ bmi +"\t");

        if (bmi < 18.5){
            System.out.print("Kekurangan BB");
        } else if (bmi <= 24.9){
            System.out.print("Ideal");
        } else if (bmi < 29.9){
            System.out.print("Kelebihan BB");
        } else {
            System.out.print("Obesitas");
        }
           System.out.println ();
        } 
    }
}
