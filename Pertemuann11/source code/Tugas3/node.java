/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
/**
 *
 * @author Alvian
 */
public class node {
    String data;
    node next;
    
    public node(String nilai, node berikutnya){
        this.data = nilai;
        this.next = berikutnya;
    }
}