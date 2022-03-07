/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Alvian
 */
public class Prisma {
    public int panjang, lebar, tinggi;
    
    int luasPermukaanPrisma(){
        return (2*(panjang*lebar)+2*(panjang+lebar)*tinggi);
    }
    int volume(){
        return (panjang*lebar*tinggi);
    }
}
