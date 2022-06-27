/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genap;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class pajak {
    int nominal,denda,bulanbayar;
    int kode;
    kendaraan data;
    pajak next;
    pajak(kendaraan data,int kode,int nominal,int denda,int bulanbayar,pajak next){
        this.data=data;
        this.kode=kode;
        this.nominal=nominal;
        this.denda=denda;
        this.bulanbayar=bulanbayar;
        this.next=next;
    }
}