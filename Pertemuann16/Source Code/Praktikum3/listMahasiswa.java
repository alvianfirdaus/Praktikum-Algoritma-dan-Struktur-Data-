/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Alvian
 */
public class listMahasiswa {
    
    List<mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(mahasiswa... Mahasiswa){
            mahasiswas.addAll(Arrays.asList(Mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(""+ mhs.toString());
        });
    }
    int linearSearch(String nim){
        for(int i=0; i<mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    int binarySearch(String nim){
        return Collections.binarySearch(mahasiswas, new mahasiswa(nim, null, null), new Comparator<mahasiswa>(){
            @Override
            public int compare(mahasiswa o1, mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    void ascSort(){
        Collections.sort(mahasiswas, new Comparator<mahasiswa>(){
            @Override
            public int compare(mahasiswa o1, mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    void dscSort(){
        Collections.reverse(mahasiswas);
    }
    
    public static void main(String[] args) {
        listMahasiswa lm = new listMahasiswa();
        System.out.println("---------------------------Data Awal------------------------------");
        mahasiswa m = new mahasiswa("201234", "Noureen", "021xx1");
        mahasiswa m1 = new mahasiswa("201235", "Akhleema", "021xx2");
        mahasiswa m2 = new mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        
        System.out.println("\n----------------Menggunakan Linear Search-----------------------");
        lm.update(lm.linearSearch("201235"), new mahasiswa("201235", "Akhleema Lela", "021xx2"));
        lm.tampil();
        
        System.out.println("\n----------------Menggunakan Binary Search-----------------------");
        lm.update(lm.binarySearch("201235"), new mahasiswa("201235", "Akhleema Lela", "021xx2"));
        lm.tampil();
        
        //asc
        System.out.println("\n----------Data Diurut Secara Ascending Collections--------------");
        lm.ascSort();
        lm.tampil();
        
        //dsc
        System.out.println("\n----------Data Diurut secara Descending Collections------------");
        lm.dscSort();
        lm.tampil();
    } 
}
