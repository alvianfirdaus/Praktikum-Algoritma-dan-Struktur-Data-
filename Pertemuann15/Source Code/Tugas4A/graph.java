/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4A;
/**
 *
 * @author Alvian
 */
public class graph <T> {
    T[] vertex;
    linkedList list[];

    public graph(T[] vertex) {
        this.vertex = vertex;
        list = new linkedList[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new linkedList();
        }
    }
    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + vertex[source] + " : " + list[source].size());

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j) == source)
                ++totalIn;
            }
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + vertex[source] + " : " +totalIn);
        System.out.println("Outdegree dari vertex " + vertex[source] + " : " +totalOut);
        System.out.println("Degree vertex " + vertex[source] + " : " +(totalIn + totalOut));
    }
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if(i==destination) {
                list[source].remove(destination);
            }
        }
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if(list[i].size() > 0 ) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                for(int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" "); 
    }
    boolean graphType(int source, int destination){
        list[source].addFirst(destination);
        return true; 
    }
}

