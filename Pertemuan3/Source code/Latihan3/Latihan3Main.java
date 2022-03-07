/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class Latihan3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        Latihan3 [] alv3 = new Latihan3[3];
        
        System.out.println("------SIAKAD POLINEMA------");
        for(int i=0; i<3; i++){
            alv3[i]= new Latihan3();
            System.out.println("Masukkan data Mahasiswa ke - "+(i+1));
            System.out.print("Masukkan Nama\t\t: ");
            alv3[i].nama = sc.nextLine();
            System.out.print("Masukkan Nim\t\t: ");
            alv3[i].nim = sd.nextInt();
            System.out.print("Masukkan Jenis Kelamin\t: ");
            alv3[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK\t\t: ");
            alv3[i].ipk = se.nextDouble();
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println("Data Mahasiswa ke - "+(i+1));
            System.out.println("Nama\t\t: "+alv3[1].nama);
            System.out.println("Nim\t\t: "+alv3[i].nim);
            System.out.println("Jenis Kelamin\t: "+alv3[i].jenisKelamin);
            System.out.println("Nilai IPK\t: "+alv3[i].ipk);
            System.out.println();
        }
    }
}
    
