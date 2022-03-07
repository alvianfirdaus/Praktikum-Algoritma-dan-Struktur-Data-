/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class BangunRuangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----Sistem Menghitung Bangun Ruang------\n");
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Prisma yang akan dihitung : ");
        int prisma = sc.nextInt();
        Prisma [] prm = new Prisma [prisma];
        System.out.println();
        
        for(int i=0; i<prisma; i++){
            prm[i] = new Prisma();
            System.out.println("Masukkan inputan Prisma ke- "+(i+1));
            System.out.print("Masukkan Panjang Prisma\t\t\t: ");
            prm[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar Prisma\t\t\t: ");
            prm[i].lebar = sc.nextInt();
            System.out.print("Masukkan Tinggi Prisma\t\t\t: ");
            prm[i].tinggi = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<prisma; i++){
            System.out.println("Hasil Menghitung Prisma ke - "+(i+1));
            System.out.println("Luas Permukaan Prisma Tersebut adalah\t : "+prm[i].luasPermukaanPrisma());
            System.out.println("Volume Prisma Tersebut adalah\t\t : "+prm[i].volume());
            System.out.println();
        }
        System.out.print("Masukkan Jumlah Kerucut yang akan dihitung : ");
        int kerucut = sc.nextInt();
        Kerucut [] krc = new Kerucut [kerucut];
        System.out.println();
        
        for(int i=0; i<kerucut; i++){
            krc[i] = new Kerucut();
            System.out.println("Masukkan inputan Kerucut ke- "+(i+1));
            System.out.print("Masukkan Jari-jari kerucut\t\t: ");
            krc[i].jariJari = sc.nextInt();
            System.out.print("Masukkan Tinggi Kerucut\t\t\t: ");
            krc[i].tinggi = sc.nextInt();
            System.out.print("Masukkan Garis Pelukis Kerucut\t\t: ");
            krc[i].garisPelukis = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<kerucut; i++){
            System.out.println("Hasil Menghitung Kerucut ke - "+(i+1));
            System.out.println("Luas Permukaan Kerucut Tersebut adalah\t : "+krc[i].luasPermukaanKerucut());
            System.out.println("Volume Kerucut Tersebut adalah\t\t : "+krc[i].volume());
            System.out.println();
        }
        System.out.print("Masukkan Jumlah Limas Persegi yang akan dihitung : ");
        int limasPersegi = sc.nextInt();
        LimasSegiEmpat [] lms = new LimasSegiEmpat [limasPersegi];
        System.out.println();
        
        for(int i=0; i<kerucut; i++){
            lms[i] = new LimasSegiEmpat();
            System.out.println("Masukkan inputan Limas Segi Empat ke- "+(i+1));
            System.out.print("Masukkan Panjang limas segi empat\t: ");
            lms[i].panjangLimas = sc.nextInt();
            System.out.print("Masukkan Tinggi limas segi empat\t: ");
            lms[i].tinggiLimas = sc.nextInt();
            System.out.print("Masukkan Lebar limas segi empat\t\t: ");
            lms[i].lebarLimas = sc.nextInt();
            System.out.print("Masukkan Alas limas segi empat\t\t: ");
            lms[i].alasLimas = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<kerucut; i++){
            System.out.println("Hasil Menghitung Limas Segi empat ke - "+(i+1));
            System.out.println("Luas Permukaan Kerucut Tersebut adalah\t : "+lms[i].luasPermukaanLimas());
            System.out.println("Volume Kerucut Tersebut adalah\t\t : "+lms[i].volumeLimas());
            System.out.println();
        }
    }
}
