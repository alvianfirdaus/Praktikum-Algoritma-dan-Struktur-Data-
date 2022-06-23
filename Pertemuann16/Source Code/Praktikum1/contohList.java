/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Alvian
 */
public class contohList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Integer> l = new ArrayList();
        
        l.add(1);
        l.add(2);
        l.add(3);
        //l.add("Cireng");
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", 
                l.get(0), l.size(), l.get(l.size() - 1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0 : %d total elemen : %d elemen terakhir : %s\n", 
                l.get(0), l.size(), l.get(l.size() - 1));
        
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", 
                names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf("Elemen 0 : %s total elemen : %s elemen terakhir : %s\n", 
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names : "+ names.toString());
        
        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen : %s elemen terakhir : %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names : "+ names.toString());
    }
    
}
