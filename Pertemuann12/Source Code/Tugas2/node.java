/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Alvian
 */
public class node {
    int id;
    String judulFilm;
    double rating;
    
    node prev, next;
    
    node(node prev, int id, String judulFilm, double rating, node next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}
