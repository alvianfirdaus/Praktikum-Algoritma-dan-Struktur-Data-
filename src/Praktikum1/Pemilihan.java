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
public class Pemilihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==============================");
        System.out.print("Masukkan nilai Tugas\t: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS\t: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS\t: ");
        int uas = sc.nextInt();
        
        float nilaiAkhir;
        String nilaiHuruf;
        nilaiAkhir = (float) ((0.2*tugas)+(0.35*uts)+(0.45*uas));
        System.out.println("Nilai Akhir\t: "+ nilaiAkhir);
        
        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Selamat Lulus");
        }else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Selamat Lulus");
        }else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Selamat Lulus");
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Selamat Lulus");
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Selamat Lulus");
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Maaf Tidak Lulus");
        }else if(nilaiAkhir > 0 && nilaiAkhir <= 39){
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf\t: "+ nilaiHuruf);
            System.out.print("Maaf Tidak Lulus");
        }
    }
}