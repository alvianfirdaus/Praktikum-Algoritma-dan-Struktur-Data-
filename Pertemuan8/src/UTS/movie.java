/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Alvian
 */
public class movie {
    int id;
    String judul;
    int tahun;
    float rating;
    
    movie(int i, String j, int t, float r){
        id = i;
        judul = j;
        tahun = t;
        rating = r;
    
    }void tampil(){
        System.out.println("ID\t: "+id);
        System.out.println("Nama\t: "+judul);
        System.out.println("Tahun\t: "+tahun);
        System.out.println("Rating\t: "+rating);
    }
}
