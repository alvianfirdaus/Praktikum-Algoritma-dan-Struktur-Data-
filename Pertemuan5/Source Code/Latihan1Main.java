/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumMinggu5;
import java.util.Scanner;
/**
 *
 * @author Alvian
 */
public class Latihan1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------- Portal Pemira BEM Tahun 2020 ---------------");
        Latihan1 lat = new Latihan1();
        Latihan1[] qwer = new Latihan1[lat.jmlhKandidat];
        for (int i = 0; i < lat.jmlhKandidat; i++) {
            qwer[i] = new Latihan1();
            System.out.print("Nama Calon Presiden BEM ke- " + (i + 1) + " : ");
            qwer[i].kandidat = sc.nextLine();
        }

        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < lat.jmlhKandidat; i++) {
            System.out.print(" Masukkan Jumlah Suara Calon Presiden Bem ke" + (i + 1) + " : ");
            qwer[i].vote = sc.nextInt();
            lat.jumlahVote += qwer[i].vote;
        }

        System.out.println("-----------------------------------------------------------------");
        int hasil = lat.hasilPemungutanSwara(lat.jumlahVote,qwer[0].vote, qwer[1].vote, qwer[2].vote, qwer[3].vote);
            System.out.println("Presiden Bem Terpilih Dimenangkan oleh : " + qwer[hasil - 1].kandidat);
    }
}
