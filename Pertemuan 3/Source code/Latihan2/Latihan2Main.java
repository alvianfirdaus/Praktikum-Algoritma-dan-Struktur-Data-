/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class Latihan2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Sistem Jual Beli Tanah------\n");
        System.out.print("Masukkan Jumlah Tanah\t: ");
        int tanah = sc.nextInt();
        Latihan2[] alv2 = new Latihan2 [tanah];
        
        System.out.println();
        
        for(int i=0; i<tanah; i++){
            alv2[i] = new Latihan2();
            System.out.println("Tanah ke - "+(i+1));
            System.out.print("Panjang\t\t: ");
            alv2[i].panjang = sc.nextInt();
            System.out.print("Lebar\t\t: ");
            alv2[i].lebar = sc.nextInt();
            System.out.println();
        }
        int terluas = 0;
        int taterLuas = 0;
        for(int i=0; i<tanah; i++){
            System.out.println("Luas Tanah "+(i+1)+"\t: "+alv2[i].hitungLuasTanah());
            if(alv2[i].hitungLuasTanah()>terluas){
                terluas=alv2[i].hitungLuasTanah();
                taterLuas=i;
            }
        }System.out.println("Tanah Terluas\t: "+"Tanah"+(taterLuas+1));
    }
}
