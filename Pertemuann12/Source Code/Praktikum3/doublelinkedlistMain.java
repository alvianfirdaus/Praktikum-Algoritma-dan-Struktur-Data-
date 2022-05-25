/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3;
/**
 *
 * @author Alvian
 */
public class doublelinkedlistMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        doublelinkedlist dll = new doublelinkedlist();
        
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        System.out.println("Data Awal pada linked list adalah : "+dll.getFirst());
        System.out.println("Data akhir pada linked list adalah : "+ dll.getLast());
        System.out.println("Data Pada indeks ke-1 pada linked list adalah : "+dll.get(1));

    } 
}
