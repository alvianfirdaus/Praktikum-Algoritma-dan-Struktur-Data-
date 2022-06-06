/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Alvian
 */
public class node_4 {
    pembeli_4 pembeli;
    pesanan_4 pesanan;
    node_4 prev, next;
    
    node_4(node_4 prev, pembeli_4 pembeli, pesanan_4 pesanan, node_4 next){
        this.prev=prev;
        this.pembeli=pembeli;
        this.pesanan=pesanan;
        this.next=next;
    }
}
