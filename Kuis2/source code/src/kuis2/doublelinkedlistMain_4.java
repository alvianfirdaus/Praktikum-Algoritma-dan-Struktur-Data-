/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class doublelinkedlistMain_4 {

    /**
     * @param args the command line arguments
     */
    public static void header(){
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Quiz 2 PRAKTIKUM ASD TI-1G dan TI-1F  ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Dibuat oleh\t\t: ALVIAN NUR FIRDAUS");
        System.out.println("NIM\t\t\t: 2141720022");
        System.out.println("Absen\t\t\t: 04");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sistem antrian resto delish");
    }
    
    public static void menu(){
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Menu");
        System.out.println(" 1. Tambah Data\n 2. Cetak Antrian\n 3. hapus Antrian\n 4. Laporan Pengurutan Pesanan BY Nama\n 5. Hitung total pendapatan\n 6. Keluar\n");
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        
        int pilih;
        do{
            header();
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
        
        }
        while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10);
    }
}
