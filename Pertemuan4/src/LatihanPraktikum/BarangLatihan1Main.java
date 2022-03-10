/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author Alvian
 */
public class BarangLatihan1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangLatihan1 bt1 = new BarangLatihan1();
        bt1.namaBarang = "Lensa Sony PXW";
        bt1.hargaSatuan = 60000;
        bt1.jumlah = 2;
        int hargaTotal=bt1.hitungHargaTotal(bt1.jumlah);
        bt1.hitungDiskon();
        bt1.hitungHargaBayar();
        bt1.tampilBarang();
    }
}
