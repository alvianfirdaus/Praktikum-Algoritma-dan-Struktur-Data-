/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class GameMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=========PACMAN=========");
        
        System.out.print("\nTentukan jumlah Pacman: ");
        int pcm = sc.nextInt();
        Pacman [] pac = new Pacman[pcm];

        System.out.print("Tentukan jumlah pil untuk setiap Pacman: ");
        int pilPcm = sc.nextInt();
        int jumlahPil = 10*pilPcm;
        System.out.println();
        
        for(int i=0; i<pcm; i++){
            pac[i] = new Pacman(jumlahPil);
            System.out.println("Pacman ke -"+(i+1)+" sesuai jumlah pil sebanyak -"+pilPcm+ " buah");
        }
        System.out.println("\n\n=========KUMAN=========");
        System.out.print("\nTentukan jumlah Kuman: ");
        int kmn = sc.nextInt();
        Kuman[] km = new Kuman[kmn];
      
        for(int i = 0; i<kmn; i++){
            int pk = 0;
            km[i] = new Kuman(pk);
            
            System.out.println("Kuman ke-"+(i+1)+ "memiliki power -"+pk);
        }
        System.out.println("\n\n======GAME PACMAN VS KUMAN=====");
        System.out.println("\nPilih Pacman yang kamu mainkan!");
        System.out.print("Pilih Pacman ke: ");
        int pilih = sc.nextInt();
        System.out.println("Pachman yang kamu pilih adalah Pacman ke -"+pilih);
        
        System.out.print("\nTentukan jumlah pil yang dimakan oleh Pacman ke-");
        int pilMkn = sc.nextInt();
        int mPil = 0;
        mPil = pilMkn*10;
        pac[pilih-1].makanPil(mPil);
        
        System.out.println("\nTentukan kuman yang kamu mainkan!");
        System.out.print("Pilih kuman ke:");
        int kmnN = sc.nextInt();
        System.out.println("Kuman ke- "+kmnN+"menyerang Pacman -"+(pilih)+" !");
        int aKuman = 10;
        km[kmnN-1].makanPacman(aKuman);
        System.out.println("Kekuatan Pachman ke-"+(pilih)+" berkurang menjadi : "+(pac[pilih-1].pilPcm-5));
    }
}
