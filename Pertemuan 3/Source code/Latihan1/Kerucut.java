/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Alvian
 */
public class Kerucut {
    public int jariJari, tinggi, garisPelukis;
    
    double luasPermukaanKerucut(){
        return (3.14*jariJari*(jariJari+garisPelukis));
    }
    double volume(){
        return (1/(float)3*3.14*jariJari*jariJari*tinggi);
    }
}
