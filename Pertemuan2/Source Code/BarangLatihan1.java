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
public class BarangLatihan1 {
    String namaBarang;
    int hargaSatuan, jumlah, harga, hargaBayar;
    float diskon;
    
    BarangLatihan1() {
        
    }
    BarangLatihan1(String nb, int jm, int hs){
        namaBarang = nb;
        jumlah = jm;
        hargaSatuan = hs;
    }
    int hitungHargaTotal(int jumlah){
        harga = jumlah*hargaSatuan;
        return 0;
    }
    void hitungDiskon(){
        if(harga > 100000){
            diskon = (float)(harga*0.1);
        }else if(harga >= 50000 && harga <= 100000){
            diskon = (float)(harga*0.05);
        }
    }
    void hitungHargaBayar (){
        hargaBayar =(int) (harga - diskon);
    }
    void tampilBarang(){
        System.out.println("Nama Barang\t= "+namaBarang);
        System.out.println("Harga Satuan\t= "+hargaSatuan);
        System.out.println("Jumlah Barang\t= "+jumlah);
        System.out.println("Harga Total\t= "+harga);
        System.out.println("Diskon\t\t= "+diskon);
        System.out.println("Harga Bayar\t= "+hargaBayar);
    }
}
