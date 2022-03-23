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
public class mainPangkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        pangkat[]png = new pangkat[5];
        png[0] = new pangkat(5, 2);
        png[1] = new pangkat(10, 2);
        png[2] = new pangkat(15, 4);
        png[3] = new pangkat(20, 2);
        png[4] = new pangkat(25, 2);
        
        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("========================================== ");
        System.out.println("1. Menggunakan Brute Force ");
        System.out.println("2. Menggunakan Devide Conquer ");
        System.out.println("3. exit ");
        System.out.print("Silahkan Pilih Metode Perhitungan : ");
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 :
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Brute force ");     
                for(int i=0; i<png.length; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
            break;
            case 2 :
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Devide Conquer ");
                for(int i=0; i<png.length; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
            break;
            case 3 :
                System.out.println("------------Terima Kasih---------");
            break;
            default :
                System.out.println("------ input yang anda masukkan salah -------");
        }
    }
}
