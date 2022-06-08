/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;
/**
 *
 * @author Alvian
 */
public class binaryTreeMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binaryTree bt = new binaryTree();
        
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.addNodeR(50);
        
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Data Terbesar Adalah : ");
        bt.maksimal();
        System.out.println("Data Terkecil Adalah : ");
        bt.minimal();
        System.out.println("-------------------------------");
        System.out.println("data yang ada di leaf : ");
        bt.printLeft(bt.root);
        System.out.println();
        System.out.println("Data Leaf Berjumlah : "+bt.jumlahLeft());
    }
}
