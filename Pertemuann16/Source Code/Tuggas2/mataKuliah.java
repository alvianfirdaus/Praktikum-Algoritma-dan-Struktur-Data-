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
public class mataKuliah {
    String kodeMk, namaMk;
    int sks;
    
    public mataKuliah(String kodeMk, String namaMk, int sks){
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }
    public String toString(){
        return String.format("%s\t%-40s%s", kodeMk, namaMk, sks);
    }
}
