/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuggas1;
/**
 *
 * @author Alvian
 */
public class film {
    String id, judul, tahun, director;
    
    public film(String id, String judul, String tahun, String director){
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }
    @Override
    public String toString(){
        return "FILM {Id Film= "+id +", Judul FIlm= "+judul+", Tahun Tayang= "+tahun+", Director= "+director+"}";
    }
}
