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
public class tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    void tampilAll(){
        System.out.println("           Blimbingsari International Airport Banyuwangi            ");
        System.out.println("====================================================================");
        System.out.println("Nama Maskapai\t\t\t : "+maskapai);
        System.out.println("Harga Tiket\t\t\t : Rp."+harga);
        System.out.println("Departure from\t\t\t : "+asal);
        System.out.println("Arrival to\t\t\t : "+tujuan);
        System.out.println("====================================================================");
    }
}
