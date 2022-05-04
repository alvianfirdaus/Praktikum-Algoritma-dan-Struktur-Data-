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
public class sllMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        
        System.out.println("------------------------------------------- LINKED LIST ---------------------------------------------");
        singLL.addFirst('a');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
        singLL.insertAfter('a','b');
        singLL.print();
        singLL.insertAt(2, 'c');
        singLL.print();
        singLL.insertBefore('e', 'd');
        singLL.print();
        
        System.out.println("\nMaka Penambahan data sudah sesuai seperti berikut ini");
        singLL.print();
        System.out.println("\n------------------------------------------- LINKED LIST ---------------------------------------------");
    }
}
