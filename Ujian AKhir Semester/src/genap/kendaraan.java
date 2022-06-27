/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genap;
//ALVIAN NURR FIRDAUS
//2141720022
/**
 *
 * @author Alvian
 */
public class kendaraan {
    String nama,tahun;
    int bulan,cc,jenis,tnkb;
    
    kendaraan(int tnkb, String nama, int jenis, int cc,String tahun,int bulan) {
       
        this.tnkb=tnkb;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun= tahun;
        this.bulan= bulan;
        
    }
}

