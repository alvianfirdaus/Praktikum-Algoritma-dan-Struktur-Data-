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
import java.util.Scanner;
public class Perulangan {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nim, n;
        
        System.out.print("Masukkan NIM anda : ");
        nim = sc.nextInt();
        System.out.println("====================");
        
        n = nim - 2141720000;
        
        if(n < 10){
            n += 10;
            System.out.println("n : " + n);
        }for(int i=0; i<n; i++){
            int cekHari = i%7;
            switch (cekHari) {
                case 0:
                    System.out.print("Senin ");
                    break;
                case 1:
                    System.out.print("Selasa ");
                    break;
                case 2:
                    System.out.print("Rabu ");
                    break;
                case 3:
                    System.out.print("Kamis ");
                    break;
                case 4:
                    System.out.print("Jum'at ");
                    break;
                case 5:
                    System.out.print("Sabtu ");
                    break;
                case 6:
                    System.out.print("Minggu ");
                    break;
                default:
                    break;
            }
        }
    }
}
