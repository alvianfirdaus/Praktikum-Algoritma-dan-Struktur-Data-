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
public class LimasSegiEmpat {
    public int panjangLimas, tinggiLimas, lebarLimas, alasLimas;
    
    public int luasPermukaanLimas(){
        return ((panjangLimas*lebarLimas) + 4*(alasLimas*tinggiLimas/2));
    }
    public int volumeLimas(){
        return ((panjangLimas*lebarLimas)/3*tinggiLimas);
    }
}
