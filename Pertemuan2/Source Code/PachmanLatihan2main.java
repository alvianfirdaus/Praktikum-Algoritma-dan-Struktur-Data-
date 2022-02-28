/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum2;

/**
 *
 * @author Alvian
 */
import java.util.Scanner;
public class PachmanLatihan2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PachmanLatihan2 pch2 = new PachmanLatihan2(1, 1, 10, 10);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------");
        System.out.println("Aturan Bermain");
        System.out.println("Tombol a untuk mengarahkan ke kiri");
        System.out.println("Tombol d untuk mengarahkan ke kanan");
        System.out.println("Tombol w untuk mengarahkan ke atas");
        System.out.println("Tombol s untuk mengarahkan ke bawah");
        System.out.println("ketik  exit untuk keluar");
        System.out.println("--------------------------------------");
        
        pch2.printPosition();
        loop : while (true){
            switch(sc.nextLine()){
                case "a" :
                pch2.moveLeft();
                break;
                
                case "d" :
                pch2.moveRight();
                break;
                
                case "w" :
                pch2.moveUp();
                break;
                
                case "s" :
                pch2.moveDown();
                break;
                
                case "exit" :
                    System.out.println("------------GAME OVER------------");
                break loop;
                
                default :
                pch2.printPosition();
            }
        }
    }
}

