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
public class sllMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        
        System.out.println("-----------Linked List--------");
        System.out.println("------------------------------");
        singLL.push("Bahasa");
        singLL.pr();
        singLL.print();
        singLL.push("Android");
        singLL.pr();
        singLL.print();
        singLL.push("Komputer");
        singLL.pr();
        singLL.print();
        singLL.push("Basis Data");
        singLL.pr();
        singLL.print();
        singLL.push("Matematika");
        singLL.pr();
        singLL.print();
        singLL.push("Algoritma");
        singLL.pr();
        singLL.print();
        singLL.push("Statistika");
        singLL.pr();
        singLL.print();
        singLL.push("Multimedia");
        singLL.pr();
        singLL.print();
        
        System.out.println("\n-----Isi Stack menjadi----\n");
        singLL.print();
        singLL.peek();
    }
}
