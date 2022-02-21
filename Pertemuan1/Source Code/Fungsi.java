/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Alvian
 */
public class Fungsi {
    public static void main(String[] args){
        System.out.println("Fungsi 1 Menampilkan Data Pada Array Stock Bunga");
        dataArray();
        System.out.println("");
        System.out.println("Fungsi 2 Menampilkan Data Stock Pada Masing masing Jenis Bunga");
        dataStockArray();
    }
    static int stock [][] = {
                            { 10, 5, 15,  7},
                            { 6, 11,  9, 12},
                            { 2, 10, 10,  5},
                            { 5,  7, 12,  9},
                            };
        
    static void dataArray(){
        for(int baris = 0; baris < stock.length; baris++){
            for(int kolom = 0; kolom <stock.length; kolom++){
                System.out.print(stock[baris][kolom] + "   ");
            }
        System.out.println("");
        }
    }
    static void dataStockArray(){
        int aglonema = stock[0][0] + stock[1][0] + stock[2][0] + stock[3][0];
        int keladi = stock[0][1] + stock[1][1] + stock[2][1] + stock[3][1];
        int alocasia = stock[0][2] + stock[1][2] + stock[2][2] + stock[3][2];
        int mawar = stock[0][3] + stock[1][2] + stock[2][3] + stock[3][3];
        System.out.println("Aglonema\t: " + aglonema);
        System.out.println("Keladi\t\t: " + keladi);
        System.out.println("Alocasia\t: " + alocasia);
        System.out.println("Mawar\t\t: " + mawar);
        
        
    }
            
}
