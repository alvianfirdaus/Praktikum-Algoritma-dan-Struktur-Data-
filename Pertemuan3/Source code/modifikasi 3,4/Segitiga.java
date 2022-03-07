/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author Alvian
 */
public class Segitiga {
    public int alas, tinggi;
    
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return alas*tinggi/2;
    }
    public int hitungKeliling(){
        return alas + alas + alas;
    }
}
