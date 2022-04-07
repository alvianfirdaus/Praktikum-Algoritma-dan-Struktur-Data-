/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Alvian
 */
public class pencarianMovie {
    movie listMv[];
    int idx;

    void tambah(movie m){
        if(idx < listMv.length){
            listMv[idx] = m;
            idx ++;
        }else{
            System.out.println("Data Sudah Penuh !!");
        }
    }
    void tampil(){
        for(movie m : listMv){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    public void tampilPosisi(float x, int pos){
        if(pos != -1){
            System.out.println("data\t: "+ x +" ditemukan pada indeks "+pos);
        }else {
            System.out.println("data\t"+ x +" tidak ditemukan");
        }
    }
    public void tampilData(float x, int pos){
        if(pos!= -1){
            System.out.println("id\t: "+listMv[pos].id);
            System.out.println("judul\t: "+listMv[pos].judul);
            System.out.println("Tahun\t: "+listMv[pos].tahun);
            System.out.println("Rating\t: "+x);
        }else{
            System.out.println("Data "+ x +" Tidak ditemukan" );
        }
    }
    void selectionSort(){
        for(int i=0;i<listMv.length-1;i++){
            int idxMin=i;
            for(int j=i+1; j<listMv.length;j++){
                if(listMv[j].rating>listMv[idxMin].rating){
                    idxMin=j;
                }
            }
            //proses swap
            movie tmp=listMv[idxMin];
            listMv[idxMin]=listMv[i];
            listMv[i]=tmp;
        }
    }
    public int findBinarySearch(float cari, int left, int right){
        int mid;
        if(right >= left){              
            mid = (left + right)/2;//proses devide
            if(cari == listMv[mid].rating){
                return(mid);
            }else if(listMv[mid].rating < cari){//proses conquer
                return findBinarySearch(cari, left, mid -1);
            }else{//proses conquer
                return findBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }
}