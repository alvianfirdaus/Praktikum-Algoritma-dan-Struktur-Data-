/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class PersegiPanjangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Persegi Panjang yang akan dihitung : ");
        int a = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[a];
        System.out.println();
        
        for(int i=0; i<a; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke -" +i);
            System.out.print("Masukkan Panjang\t: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar \t\t: ");
            ppArray[i].lebar = sc.nextInt();
        }
        
        System.out.println();
        for(int i=0; i<a; i++){
            System.out.println("Persegi panjang ke-"+ i);
            System.out.println("Panjang : "+ ppArray[i].panjang + ", lebar : "+ ppArray[i].lebar);
        }
    } 
}
