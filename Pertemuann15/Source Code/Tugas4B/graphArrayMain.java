/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4B;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class graphArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        
        graphArray <String> graph;
        
        try {
            System.out.print("Masukkan Jumlah Vertices\t: ");
            v = sc.nextInt();
            System.out.print("Masukkan Jumlah Edges\t\t: ");
            e = sc.nextInt();
            
            String[] vertexs = new String[v + 1]; 
            sc.nextLine();
            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertexs[i] = sc.nextLine();
            }
            graph = new graphArray<String>(vertexs);
            
            System.out.println("Masukkan Edge: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(vertexs[i] + "\t");
            }
            System.out.println();
            
            for (int i = 1; i <= v; i++) {
                System.out.print(vertexs[i] + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error, Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close(); 
    }
}

