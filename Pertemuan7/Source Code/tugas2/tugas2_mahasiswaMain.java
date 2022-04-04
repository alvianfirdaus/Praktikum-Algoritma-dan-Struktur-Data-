/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class tugas2_mahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        tugas2_pencarianMhs data = new tugas2_pencarianMhs();
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        tugas2_mahasiswa[] inputan=new tugas2_mahasiswa[jumMhs];
        data.listMhs=inputan;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for(int i=0; i < jumMhs; i++){
            System.out.println("-----------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            
            tugas2_mahasiswa m = new tugas2_mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }    
        System.out.println("________________________________________________________");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
            
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
        System.out.print("Nama\t: ");
        String cari = sl.nextLine();

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}

