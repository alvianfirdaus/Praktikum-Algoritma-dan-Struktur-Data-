/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class mainFaktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long awal = System.currentTimeMillis();
        System.out.println("Waktu awal : "+ String.valueOf(awal)+" milidetik");
        System.out.println("============================================");
        System.out.print("Masukkan Jumlah Elemen yang akan dihitung : ");
        int elemen = sc.nextInt();
        
        faktorial [] fk = new faktorial[elemen];
        for (int i=0; i<elemen; i++){
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("======================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialIBF(fk[i].nilai));
        }
        System.out.println("======================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("======================================");
        long akhir =  System.currentTimeMillis();
        System.out.println("Waktu Akhir\t: "+ String.valueOf(akhir)+" milidetik");
        
        long elapsTime = akhir-awal;
        System.out.println("Interval Waktu\t: "+ String.valueOf(elapsTime)+ " milidetik");
    }
}
