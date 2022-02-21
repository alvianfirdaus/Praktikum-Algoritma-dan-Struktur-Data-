/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Arrays;

/**
 *
 * @author Alvian
 */
public class Tugas1 {
    public static void main(String[] args){
        
        int budi = 15;
        int bina = 6;
        int ani = 4;
        int cita = 11;
        
        int dataNumb[] = {budi, bina, ani, cita};
    
        Double harga = 0.0;
        for(int i=0; i<dataNumb.length; i++){
            if(dataNumb[i] > 10){
                harga = (Double)(harga + dataNumb[i] * 4500) - dataNumb[i] * 4500 * 0.05;
            }
            harga = harga + dataNumb[i] * 4500;
        }
        System.out.println("---- SISTEM NOTA HARIAN SMILE LAUNDRY ----");
        System.out.println("Rincian Data Perkilo pembeli");
        System.out.println(Arrays.toString(dataNumb));
        System.out.print("Pendapatan Smile Laundry Hari itu Adalah : Rp" + harga);
    }     
}
