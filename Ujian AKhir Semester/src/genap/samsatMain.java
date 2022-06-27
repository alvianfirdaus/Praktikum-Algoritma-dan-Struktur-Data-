/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genap;
import java.util.Scanner;
//ALVIAN NURR FIRDAUS
//2141720022
public class samsatMain {
    public static void main(String[] args) {
        kendaraan k;
        int tnkb;
        pajak p;
        boolean file;
        int menu;

        singleLinkedList alv = new singleLinkedList();

        System.out.println("SISTEM SAMSAT TERINTEGRASI BANYUWANGI");
        System.out.println("      Jatim Kuat Jatim Tangguh       ");
        System.out.println("Admin   : ALVIAN NUR FIRDAUS");
        System.out.println("Status  : ASN");
        System.out.println("--------------------------------------");
        System.out.println("Data Kendaraan Roda 2 & roda 4");
        k = new kendaraan(111, "Alvian", 2, 250, "2020", 2);
        alv.addFirst(k);
        k = new kendaraan(222, "Ega", 2, 100, "2015", 2);
        alv.addLast(k);
        k = new kendaraan(333, "Fikri", 2, 200, "2006", 2);
        alv.addLast(k);
        k = new kendaraan(445, "Nur", 4, 1000, "2006", 2);
        alv.addFirst(k);
        k = new kendaraan(554, "Firdaus", 4, 2500, "2008", 2);
        alv.addLast(k);
        k = new kendaraan(665, "Fernan", 4, 3000, "2009", 2);
        alv.addLast(k);
        alv.print();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("=========================================");
            System.out.println("         SISTEM SAMSAT BANYUWANGI         ");
            System.out.println("=========================================");
            System.out.println("1. Data Masuk  ");
            System.out.println("2. Cetak ");
            System.out.println("3. Urutkan Data");
            System.out.println("4. Keluar ");
            System.out.print("Input Nomer\t\t:");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                {
                    System.out.println("=====================================");
                    System.out.println("\t\t BAYAR PAJAK");
                    System.out.println("=====================================");
                    do
                    {
                        System.out.print("Masukkan TNKB\t\t: ");
                        tnkb = sc.nextInt();
                        file = alv.Denda(tnkb);
                    } while (file == false);
                }
                break;
                 case 2: {
                     alv.printpajak();
                     System.out.println("Total Pendapatan " + alv.totalakhir);
            
                }
                 case 3:{  
                 }
            }
        } while (menu > 0 && menu < 4);   
    }
}   

