/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuggas2;
/**
 *
 * @author Alvian
 */
public class mahasiswa {
    String nim, nama, noTelp;
    
    public mahasiswa(){
        
    }
    public mahasiswa(String nim, String nama, String noTelp){
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
    @Override
    public String toString(){
        return String.format("%s\t%-15s\t%s", nim, nama, noTelp);
    }
}
