# **Laporan Praktikum Pertemuan 2**
# **Jobseat 2 - objeck**

## **Profil mahasiswa**

<center><img src="images/pp.jpg" alt = "Image" height = "125" width = "100"></center>

- Nama : Alvian Nur Firdaus
- Kelas : 1F
- Prodi : D-IV Teknik Informatika
- Nim : 2141720022

<b>
</br>

## **2.1 Tujuan Praktikum**
Setelah melakukan materi praktikum ini, mahasiswa mampu: 

1. Mengenal objek dan class sebagai konsep mendasar pada pemrograman berorientasi objek 
2. Mendeklarasikan class, atribut dan method 
3. Membuat objek (instansiasi) 
4. Mengakses atribut dan method dari suatu objek 
5. Menerapkan konstruktor

<b>
</br>

## **2.2 Deklarasi Class, Atribut dan Method**
 Waktu : 45 Menit 
 ### Perhatikan Diagram Class berikut ini:

  <p align ="center">
    <img src="images/1.png" align="center">
    </p>


 ### Berdasarkan diagram class di atas, akan dibuat program class dalam Java. 

<b>
</br>

 ### **2.2.1 Langkah-langkah Percobaan** 

 1. Buat Project baru, dengan nama StrukturData. Buat paket dengan nama minggu2, buatlah class baru dengan nama Barang.

    ### membuat namaproject 
      <img src = "images/2.png">
    
    ### namapaket
      <img src = "images/3.png">
    
    ### namaclass
      <img src = "images/4.png">
<b>
</br>

 2. Lengkapi class Barang dengan atribut dan method yang telah digambarkan di dalam diagram class di atas, sebagai berikut

```java
    package minggu2;

/**
 *
 * @author Alvian
 */
public class barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    void tampilBarang(){
        System.out.println("Nama = "+ namaBarang);
        System.out.println("Jenis = "+ jenisBarang);
        System.out.println("Stok = "+ stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    void tambahStok(int n){
        stok = stok + n;
    }
    void kurangiStok(int n){
        stok = stok -n;
    }
    int hitungHargaTotal(int jumlah ){
        return jumlah*hargaSatuan;
    }
}

```

<b>
</br>

 3. Coba jalankan (Run) class Barang tersebut. Apakah bisa? 
    >Jawab : Tidak Bisa DIjalankan
      >><img src = "images/5.png">
 
<b>
</br>

  ### **2.2.2 Verifikasi Hasil Percobaan Cocokkan hasil compile kode program anda dengan gambar berikut ini.**

  >Jawab : Ya cocok dengan di jobseat, program tidak bisa dijalankan karena tidak ada main classnya
  >><img src = "images/5.png">
<b>
</br>

  ### **2.2.3 Pertanyaan**

   1. Sebutkan 2 karakteristik class/objek! 
   
      >Jawab : <p>Karakteristik object yang pertama adalah memiliki sesuatu : data karakter/properti/variabel/state/field/atribut</p>
            <p>Karakteristik object yang kedua adalah bisa melakukan sesuatu tingkah laku /behavior/fungsi/method</p>

   2. Kata kunci apakah yang digunakan untuk mendeklarasikan class? 
   
      >Jawab : Format deklarasi class adalah seperti berikut ini
```java
class NamaClass{
        //deklarasi attribut
        //deklarasi method
}
 ```

   3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan? 
   
      > Jawab : ada 4 atribut yaitu : namaBarang, jenisBarang, stok, hargaSatuan. Atribut tersebut di deklarasikan pada baris ke 13 dan baris ke 14. sebagai bukti untuk memperkuat maka kami cantumkan gambar dibawah ini
      >><img src = "images/11.png">

   4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan? 
   
      > Jawab : Terdapat 4 atribut yang dimiliki oleh class barang, adapun rinciannya yaitu terdapat 3 void dan 1 return
      >- void tampilBarang()
      >- void tambahStok()
      >- void kurangiStok()
      >- int hitungHargaTotal()</p>
    method tersebut dideklarasikan pada baris ke 16, 23, 27, 31. untuk membuktikannya lihat gambar dibawah ini 
    <img src = "images/12.png">

   5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
   
      >Jawab : 
        >><img src = "images/13.png">

   6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int? 
   
      >Jawab : karena nama dari parameter tidak boleh sama dengan nama variabel yang sudah ada dideklarasikan pada bagian atribut. dari nama parameter (int n) merujuk pada (int stok) yang sudah ada dideklarasikan pada bagian atribut diatas yang digunakan untuk memberikan nilai pada saat instansiasi

   7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int? 
   
      > Jawab : karena memiliki nilai yang akan dikembalikan return dan juga memiliki parameter yang bertipe data int. yang nantinya akan merujuk pada varabel hargaSatuan yang sudah dideklarisikan pada bagian atribut lalu melakukan proses perhitungan

   8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void? 
   
      > Jawab : menurut saya karena tidak memiliki nilai yang akan dikembalikan 

<b>
</br>

## **2.3 Instansiasi Objek dan Mengakses Atribut & Method** 
  
  Waktu : 45 Menit 
  
  Sampai tahap ini, kita telah membuat class Barang dengan sukses. Selanjutnya, apabila diinginkan untuk mulai menggunakan class Barang tersebut, mengakses atribut-atribut dan method-method yang ada di dalamnya, maka selanjutnya perlu dibuat objek/instance dari class Barang terlebih dahulu. 

  ### **2.3.1 Langkah-langkah Percobaan**

  1. Di dalam paket minggu2, buatlah class baru dengan nama BarangMain. Dan di dalam class BarangMain tersebut, buatlah method main().
      <img src = "images/6.png">

  2. Di dalam method main(), lakukan instansiasi, dan kemudian lanjutkan dengan mengakses atribut dan method dari objek yang telah terbentuk.
``` java

package minggu2;

/**
 *
 * @author Alvian
 */
public class BarangMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        barang bl = new barang(); //instance objec
        
        //akses atribute
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        
        //akses methode
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal); 
    }
} 
```

  3. Jalankan (Run) class BarangMain tersebut dan amati hasilnya.
      >Jawab : Sudah bisa dijalankan
        >><img src = "images/run1.png">

  ### **2.3.2 Verifikasi Hasil Percobaan** 
  Cocokkan hasil compile kode program anda dengan gambar berikut ini.

  >Jawab : Ya cocok dengan di jobseat, program bisa dijalankan karena sudah ada main classnya
      >><img src = "images/run2.png">

 ### **2.3.3 Pertanyaan**
  1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan?

      > Jawab : untuk di apache netbeans saya terdapat pada baris  ke 19, untuk buktinnya terdapat pada gambar dibawah ini
      >><img src = "images/14.png">
      > nama objeck yang dihasilkan adalah bl
      >><img src = "images/15.png">


  2. Bagaimana cara mengakses atribut dan method dari suatu objek? 

      > Jawab :
      > mengakses Atribut
      >>namaObjek.namaAtribut = nilai;
      >><p>bl.namaBarang = "cosair";
      >Mengakses method
      >>namaObjeck.namaMethod ();
      >><p>bl.tambahStok(1);

  
<br>
</br>

## **2.4 Membuat Konstruktor**
Waktu : 45 Menit 

Di dalam percobaan ini, kita akan mempraktekkan bagaimana membuat berbagai macam konstruktor berdasarkan parameternya. 

  ### **2.4.1 Langkah-langkah Percobaan**
   1. Perhatikan kembali class Barang. Tambahkan di dalam class Barang tersebut 2 buah konstruktor. 1 konstruktor default dan 1 konstruktor berparameter.
``` java
package minggu2;

/**
 *
 * @author Alvian
 */
public class barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    barang (){
        
    }
    barang (String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    void tampilBarang(){
        System.out.println("Nama = "+ namaBarang);
        System.out.println("Jenis = "+ jenisBarang);
        System.out.println("Stok = "+ stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    void tambahStok(int n){
        stok = stok + n;
    }
    void kurangiStok(int n){
        stok = stok - n;
    }
    int hitungHargaTotal(int jumlah ){
        return jumlah*hargaSatuan;
    }
}
```
  2. Buka kembali class BarangMain. Dan buat sebuah objek lagi, kali ini dengan menggunakan konstruktor berparameter.

``` java
package minggu2;

/**
 *
 * @author Alvian
 */
public class BarangMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        barang bl = new barang(); 
        
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        barang b2 = new barang ("Logitech", "wireles mouse", 25, 150000);
        b2.tampilBarang();
    }
}
```
  3. Jalankan kembali class BarangMain dan amati hasilnya.
      ><img src = "images/7.png">

 ### **2.4.2 Verifikasi Hasil Percobaan**
  Cocokkan hasil compile kode program anda dengan gambar berikut ini.

  >Jawab : Ya sama Seperti yang dijelaskan di jobseat
  >><img src ="images/run3.png">
  
  
 ### **2.4.3 Pertanyaan**

  1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan?
      > Jawab : pada baris ke 18, seperti yang terlihat pada gambar dibawah ini
      >><img src="images/16.png">

  2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program dibawah ini?
      <img src = "images/8.png">

        > Jawab : Melakukan instansiasi pembuatan objeck dengan nama b2, serta menggunakan konstruktor berparameter yang langsung diisi nilai.

  3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang. 

      >Jawab : kode program
      >><img src = "images/17.png">
      >hasil run
      >><img src = "images/18.png">

<br>
</br>

## **2.5 Latihan Praktikum**
Waktu : 60 Menit 

1. Buat program berdasarkan diagram class berikut ini! 
<p align ="center">
    <img src="images/9.png" align="center">
</p>
      
- Method hitungHargaTotal() digunakan untuk menghitung harga total yang merupakan perkalian antara hargaSatuan dengan jumlah barang yang dibeli 

- Method hitungDiskon() digunakan untuk menghitung diskon dengan aturan sbb: 
   - Jika harga total > 100000, akan mendapat diskon 10% 
   - Jika harga total mulai dari 50000 sampai 100000 akan mendapat diskon sebesar 5%
   - Jika dibawah 50000 tidak mendapat diskon
   - Method  hitungHargaBaya diskon r()  digunakan  untuk  menghitung  harga  total  setelah  dikurangi 
<p>
Jawab :
<p>Pertama tama disini saya membuat nama project Jobseat1, dan membuat nama package Latihan Praktikum, dan selanjutnya membuat Jaca clash "BarangLatihan1" dengan kode program dibawah ini :

```java
package LatihanPraktikum;

/**
 *
 * @author Alvian
 */
public class BarangLatihan1 {
    String namaBarang;
    int hargaSatuan, jumlah, harga, hargaBayar;
    float diskon;
    
    BarangLatihan1() {
        
    }
    BarangLatihan1(String nb, int jm, int hs){
        namaBarang = nb;
        jumlah = jm;
        hargaSatuan = hs;
    }
    int hitungHargaTotal(int jumlah){
        harga = jumlah*hargaSatuan;
        return 0;
    }
    void hitungDiskon(){
        if(harga > 100000){
            diskon = (float)(harga*0.1);
        }else if(harga >= 50000 && harga <= 100000){
            diskon = (float)(harga*0.05);
        }
    }
    void hitungHargaBayar (){
        hargaBayar =(int) (harga - diskon);
    }
    void tampilBarang(){
        System.out.println("Nama Barang\t= "+namaBarang);
        System.out.println("Harga Satuan\t= "+hargaSatuan);
        System.out.println("Jumlah Barang\t= "+jumlah);
        System.out.println("Harga Total\t= "+harga);
        System.out.println("Diskon\t\t= "+diskon);
        System.out.println("Harga Bayar\t= "+hargaBayar);
    }
}
```

setelah itu saya membuat java main class dengan nama "BarangLatihan1Main" dengan kode program dibawah ini :

```java
package LatihanPraktikum;

/**
 *
 * @author Alvian
 */
public class BarangLatihan1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangLatihan1 bt1 = new BarangLatihan1();
        bt1.namaBarang = "Lensa Sony PXW";
        bt1.hargaSatuan = 120000;
        bt1.jumlah = 12;
        int hargaTotal=bt1.hitungHargaTotal(bt1.jumlah);
        bt1.hitungDiskon();
        bt1.hitungHargaBayar();
        bt1.tampilBarang();
    }
}
```

    setelah keduannya berhasil kami buat, selanjutnya kami melakukan pengujian program dengan cara meng Run program atau menjalankan program dan menghasilkan program seperti gambar dibawah ini : 
><img src="images/run4.png" align="center">


<br>
</br>

## ----------------------------------------------------------
2. Buat  program  berdasarkan  diagram  class  berikut  ini!
<p align ="center">
    <img src="images/10.png" align="center">
</p>

  - Atribut  x  digunakan  untuk  menyimpan  posisi  koordinat  x  (mendatar)  dari  pacman,  sedangkan atribut  y  untuk  posisi koordinat  y  (vertikal) 

  - Atribut  width  digunakan  untuk  menyimpan  lebar  dari  area  permainan,  sedangkan  height untuk menyimpan  panjang  area

  -  Method  moveLeft()  digunakan  untuk  mengubah  posisi  pacman  ke  kiri  (koordinat  x  akan berkurang  1),  sedangkan moveRight()  untuk bergerak  ke  kanan  (koordinat  x  akan  bertambah 1).  Perlu  diperhatikan  bahwa  koordinat  x  tidak  boleh  lebih  kec nilai width il  dari  0  atau  lebih  besar  dari nilai width
  
  - Method  moveUp()  digunakan  untuk  mengubah  posisi  pacman  ke  atas  (koordinat  y  akan berkurang 1), sedangkan moveDown() untuk bergerak ke bawah (koordinat y akan bertambah 1).  Perlu  diperhatikan  bahwa  koordinat  y  tid nilai height

Jawab
Pertama tama disini saya masih menggunakan project Jobseat1, dan membuat dan menambah package dengan nama nama LatihanPraktikum2, dan selanjutnya membuat Java clash "PachmanLatihan2" dengan kode program dibawah ini :

``` java
package LatihanPraktikum2;

/**
 *
 * @author Alvian
 */
public class PachmanLatihan2 {
    int x, y, width, height;
    
    PachmanLatihan2(){
        
    }
    PachmanLatihan2(int xh, int yv, int w, int h){
        x = xh;
        y = yv;
        width = w;
        height = h;
    }
    void moveLeft(){
        if(x > 1)x--;
        printPosition();
    }
    void moveRight(){
        if(x < width-1)x++;
        printPosition();
    }
    void moveUp(){
        if(y > 1)y--;
        printPosition();
    }
    void moveDown(){
        if(y < height -1)y++;
        printPosition();
    }
    void printPosition(){
        for(int i = 0; i <= height; i++){
            for(int j=0; j <= width; j++){
                if(i == 0 || i == height || j == 0 || j == width){
                    System.out.print("A  ");
                }else if (i == y && j == x) {
                    System.out.print("O  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
```

setelah itu saya membuat java main class dengan nama "PachmanLatihan2Main" dengan kode program dibawah ini :

```java
package LatihanPraktikum2;

/**
 *
 * @author Alvian
 */
import java.util.Scanner;
public class PachmanLatihan2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PachmanLatihan2 pch2 = new PachmanLatihan2(1, 1, 10, 10);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------");
        System.out.println("Aturan Bermain");
        System.out.println("Tombol a untuk mengarahkan ke kiri");
        System.out.println("Tombol d untuk mengarahkan ke kanan");
        System.out.println("Tombol w untuk mengarahkan ke atas");
        System.out.println("Tombol s untuk mengarahkan ke bawah");
        System.out.println("ketik  exit untuk keluar");
        System.out.println("--------------------------------------");
        
        pch2.printPosition();
        loop : while (true){
            switch(sc.nextLine()){
                case "a" :
                pch2.moveLeft();
                break;
                
                case "d" :
                pch2.moveRight();
                break;
                
                case "w" :
                pch2.moveUp();
                break;
                
                case "s" :
                pch2.moveDown();
                break;
                
                case "exit" :
                    System.out.println("------------GAME OVER------------");
                break loop;
                
                default :
                pch2.printPosition();
            }
        }
    }
}
```
setelah keduannya berhasil kami buat, selanjutnya kami melakukan pengujian program dengan cara meng Run program atau menjalankan program dan menghasilkan program seperti gambar dibawah ini : 

<p><img src="images/run5.png">

>Sesuai printah apabila diklik tombol "d" maka pachman akan bergerak ke kanan
>><img src="images/d.png">
>apabila diklik tombol "s" maka pachman akan bergerak ke bawah
>><img src="images/s.png">
>apabila diklik tombol "a" maka pachman akan bergerak ke kiri
>><img src="images/a.png">
>apabila diklik tombol "w" maka pachman akan bergerak ke atas
>><img src="images/w.png">
>apabila diketik "exit" maka game akan berhenti
>><img src="images/exit.png">

<br>
<p><center>----------------- Terima Kasih-------------</center></p>