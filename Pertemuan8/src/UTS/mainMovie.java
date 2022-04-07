/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class mainMovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        pencarianMovie data = new pencarianMovie();
        System.out.print("Masukkan jumlah Movie : ");
        int jumMovie = s.nextInt();
        movie[] inputan=new movie[jumMovie];
        data.listMv = inputan;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data Movie");
        for(int i=0; i < jumMovie; i++){
            System.out.println("-----------------------------------------------------");
            System.out.print("Masukkan ID");
            int id = s.nextInt();
            System.out.print("Judul\t: ");
            String judul = sl.nextLine();
            System.out.print("Tahun\t: ");
            int tahun = s.nextInt();
            System.out.print("Rating\t: ");
            float rating = s.nextFloat();
            
            movie m = new movie(id, judul, tahun, rating);
            data.tambah(m);
        }    
        System.out.println("________________________________________________________");
        System.out.println("Data Keseluruhan Movie : ");
        data.tampil();
        
        System.out.println("________________________________________________________");
        System.out.println("Data Setelah diurutkan menggunakan Selection Sort (dsc): ");
        data.selectionSort();
        data.tampil();
            
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Rating Movie yang dicari : ");
        System.out.print("Cari Rating\t: ");
        float cari = s.nextFloat();
        
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Menggunakan Binary Search");
        int posisi = data.findBinarySearch(cari, 0, jumMovie -1);
        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}