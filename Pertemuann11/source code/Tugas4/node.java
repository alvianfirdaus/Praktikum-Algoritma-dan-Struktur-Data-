/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;
/**
 *
 * @author Alvian
 */
public class node {
    String nim, nama;
    int absen;
    double ipk;
    node next;
    
    public node(String nim, String nama, int absen, double ipk, node berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk =ipk;
        this.next = berikutnya;
    }
}
