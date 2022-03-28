/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
/**
 *
 * @author Alvian
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        daftarMahasiswaBerprestasi list = new daftarMahasiswaBerprestasi();
        mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa("Rara", 2012, 19, 4);
        mahasiswa m3 = new mahasiswa("Dompu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum Sorting = ");
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setela sorting desc berdasarkan ipk (menggunakan Bobble Short)");
        list.bubbleSort();
        list.tampil();
        
        System.out.println();
        System.out.println("Data mahasiswa stelah sorting asc berdasarkan ipk (menggunakan Selection Short)");
        list.selectionSort();
        list.tampil();
        
        System.out.println();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (menggunakan Insertion Short)");
        list.insertionSort(true);
        list.tampil();
        
        System.out.println();
        System.out.println("Data mahasiswa setelah sorting dsc berdasarkan ipk (menggunakan Insertion Short)");
        list.insertionSort(false);
        list.tampil();

    }
}
