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
public class Array {
    public static void main(String[] args){
        int stock [][] = {
                         { 10,  5, 15,  7},
                         {  6, 11,  9, 12},
                         {  2, 10, 10,  5},
                         {  5,  7, 12,  9},
                         };
        
        int aglonema = stock[0][0] + stock[1][0] + stock[2][0] + stock[3][0];
        int keladi = stock[0][1] + stock[1][1] + stock[2][1] + stock[3][1];
        int alocasia = stock[0][2] + stock[1][2] + stock[2][2] + stock[3][2];
        int mawar = stock[0][3] + stock[1][2] + stock[2][3] + stock[3][3];
        
        System.out.println("A. Jumlah Stock Bunga Pada Seluruh Cabang");
        System.out.println("Aglonema\t: " + aglonema);
        System.out.println("Keladi\t\t: " + keladi);
        System.out.println("Alocasia\t: " + alocasia);
        System.out.println("Mawar\t\t: " + mawar);
        
        int a = stock[0][0] - 1;
        int b = stock[0][1] - 2;
        int c = stock[0][2] - 0;
        int d = stock[0][3] - 5;
        
        System.out.println("");
        System.out.println("B. Setelah Pengurangan Stock karena Bunga Mati Pada Toko Royal Garden 1");
        System.out.println("Aglonema\t: "+ a);
        System.out.println("Keladi\t\t: "+ b);
        System.out.println("Alocasia\t: "+ c);
        System.out.println("Mawar\t\t: "+ d);
        
        int pendapatan = (a*75000) + (b*50000) + (c*60000) + (d*10000);
        System.out.println("");
        System.out.println("Pendapatan Royal Garden 1 Adalah Sebesar : "+ pendapatan);
    }
}
