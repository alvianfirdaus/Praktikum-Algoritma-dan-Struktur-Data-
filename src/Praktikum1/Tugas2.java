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
public class Tugas2 {
    public static void main(String[] args){
        
        System.out.println("---- PROGRAM MENGHITUNG RUMUS ----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Jarak\t: ");
        int s = sc.nextInt();
        System.out.print("Input Waktu\t: ");
        int t = sc.nextInt();
        System.out.print("Input Kecepatan\t: ");
        int v = sc.nextInt();
        
        System.out.println("\nMENU RUMUS");
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("\nPilih Rumus\t: ");
        int menuRumus = sc.nextInt();
        
        switch (menuRumus){
            case 1:
                System.out.println("\nKecepatan\t: "+ kecepatan(s, t)+ " Meter/Sekon");
                break;
            case 2:
                System.out.println("\nJarak\t\t: "+ jarak(v, t)+" Meter");
                break;
            case 3:
                System.out.println("\nWaktu\t\t: "+ waktu(s, v)+ " sekon");
                break;
            default:
               System.out.println("\nMohon Maah yang anda inputkan salah :)");
               break;
        }
    }
    static int kecepatan(int s, int t){
        int v = s/t;
        return v;
    }
    static int jarak(int v, int t){
        int s = v*t;
        return s;
    }
    static int waktu(int s, int v){
        int t = s/v;
        return t;
    }
}
