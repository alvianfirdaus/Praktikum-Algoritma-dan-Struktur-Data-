/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPraktikum;
/**
 *
 * @author Alvian
 */
public class mainTiket {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tiketService daftar = new tiketService();
        tiket t1 = new tiket ("SUSI AIR", 300000, "Blimbingsari Banyuwangi(BWX)", "Trunojoyo Madura(SUP)");
        tiket t2 = new tiket ("VIAN AIR", 1500000, "Blimbingsari Banyuwangi(BWX)", "Changi Singapura(SIN)");
        tiket t3 = new tiket ("CITILINK", 650000, "Blimbingsari Banyuwangi(BWX)", "I gusti Ngurah ray Bali(DPS)");
        tiket t4 = new tiket ("BATIK AIR", 900000, "Blimbingsari Banyuwangi(BWX)", "Soekarno Hatta Jakarta(CGK)");
        tiket t5 = new tiket ("WINGS AIR", 500000, "Blimbingsari Banyuwangi(BWX)", "Juanda Surabaya(SUB)");
        
        daftar.tambah(t1);
        daftar.tambah(t2);
        daftar.tambah(t3);
        daftar.tambah(t4);
        daftar.tambah(t5);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-                        DATA SEBELUM SORTING                      -");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        daftar.tampilAll();
        
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-    DAFTAR HARGA SETELAH SORTING (ASC) MENGGUNAKAN BUBBLE SORT    -");
        System.out.println("--------------------------------------------------------------------");
        daftar.bubbleSort();
        daftar.tampilAll();
        
        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("-  DAFTAR HARGA SETELAH SORTING (DSC) MENGGUNAKAN SELECTION SORT   -");
        System.out.println("--------------------------------------------------------------------");
        daftar.selectionShort();
        daftar.tampilAll();
    }
}
