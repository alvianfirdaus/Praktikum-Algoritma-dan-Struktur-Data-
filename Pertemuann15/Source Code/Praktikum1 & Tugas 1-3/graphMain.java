/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class graphMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vertex, edge, source, destination;
        graph grp = new graph(6);
        
        System.out.print("Masukkan Vertex\t\t: ");
        vertex = sc.nextInt();
        
        System.out.print("Masukkan Edge\t\t: ");
        edge = sc.nextInt();
        
        int menu;
        do{
            System.out.println("Pilih menu dibawah ini");
            System.out.println("1. Directed(Tugas Praktikum 1)\n2. Undirected(Tugas Pratikum 2)");
            System.out.print("Masukkan Menu : ");
            menu = sc.nextInt();
            
            if(menu == 1){
                
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
            
                    grp.addEdge(source, destination);
                }
            System.out.println("");
            grp.printGraph();
            }else if(menu == 2){
                
                for(int i=0; i<edge; i++){
                    System.out.print("Masukkan Source\t\t: ");
                    source = sc.nextInt();
                    System.out.print("Masukkan Destination\t: ");
                    destination = sc.nextInt();
            
                    grp.graphType(source, destination);
                }
            System.out.println("");
            grp.printGraph();
            }
        }while (menu != 1 && menu != 2);
    }
}
