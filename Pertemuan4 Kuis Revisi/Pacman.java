/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author Alvian
 */
public class Pacman {
    int pilPcm;
    
    Pacman (int pc){
        pilPcm = pc;
        System.out.println("energi default sebesar: "+ pilPcm+" diberikan kepada");
    }
    
    void makanPil(int n){
        pilPcm += n;
        System.out.println("Energi yang diperoleh Pacman: " + pilPcm);
    }
}
