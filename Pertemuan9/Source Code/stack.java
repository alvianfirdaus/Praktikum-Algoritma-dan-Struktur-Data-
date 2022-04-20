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
public class stack {
    int size, top;
    pakaian data[];
    
    public stack(int size){
        this.size = size;
        data = new pakaian[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(pakaian pkn){
        if(!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack Penuh");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar : "+ x.jenis +" "+ x.warna +" "+ x.merk +" "+ x.ukuran +" "+ x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: "+ data[top].jenis  +" "+ data[top].warna +" "+ data[top].merk +" "+ data[top].ukuran +" "+ data[top].harga);
    }
    public void print(){
        System.out.println();
        System.out.println("Isi stack : ");
        for(int i=top; i >= 0; i--){
            System.out.println(data[i].jenis + " "+ data[i].warna +" "+ data[i].merk +" "+ data[i].ukuran +" "+ data[i].harga +" ");
        }
        System.out.println("");
    }
    public void clear(){
        if(!IsEmpty()){
            for(int i=top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal! Stack masih kosong");
        }
    }
    public void getMin(){
        double hrgMin = data[0].harga;
        int idn = 0;
        for(int i = 1; i <= top; i++){
            if (hrgMin > data[i].harga){
                idn = i;
                hrgMin = data[i].harga;
            }
        }
        System.out.println("Harga Pakaian Terendah adalah\t: "+data[idn].harga);
        System.out.println("Dengan merk\t\t\t: "+data[idn].merk);
    }
}
