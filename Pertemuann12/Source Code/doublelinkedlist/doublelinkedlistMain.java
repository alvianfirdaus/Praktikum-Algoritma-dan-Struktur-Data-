/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;
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
        System.out.println("Size  : "+dll.size());
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("size : "+dll.size());
        System.out.println("===============================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
    }   
}
