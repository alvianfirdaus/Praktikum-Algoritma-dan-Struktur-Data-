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
public class doublelinkedlist_4 {
    node_4 head;
    int size;

    public doublelinkedlist_4(){
        head = null;
        size = 0;    
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(pembeli_4 pem, pesanan_4 pes){
        if (isEmpty()) {
            head = new node_4(null, pem, pes, null);
        } else {
            node_4 newNode = new node_4(null, pem, pes, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void print(){
        if (!isEmpty()) {
            node_4 tmp = head;
            while(tmp != null){
                
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Antrian masih Kosong !");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Telah Memesan Menu");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
}
