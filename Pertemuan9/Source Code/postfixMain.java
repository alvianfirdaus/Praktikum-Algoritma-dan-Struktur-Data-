/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class postfixMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.print("Masukkan ekspresi matematika (infix)\t: ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        postfix post = new postfix(total);
        P = post.konversi(Q);
        System.out.println();
        System.out.println("Postfix\t\t\t\t\t: "+ P);
    }
}
