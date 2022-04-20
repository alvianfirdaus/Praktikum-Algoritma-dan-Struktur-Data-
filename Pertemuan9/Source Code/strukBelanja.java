/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
/**
 *
 * @author Alvian
 */
public class strukBelanja {
    String tanggal, namaBarang;
    int noTransaksi, jmlh, total;

    strukBelanja(int nt, String tgl, String nb, int j, int t){
    noTransaksi =nt;
    tanggal =tgl;
    namaBarang =nb;
    jmlh =j;
    total =t;
    }
}
