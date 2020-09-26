/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakbejopart2;

/**
 *
 * @author salik
 */
public class MemilihKeramik {
  /* menentukan Atribut*/
    double panjang, lebar, luasTanah, isiPerBox, hargaPerBox ;
    String jenis;
    
    /* constructor */
    MemilihKeramik(double p, double l, double x, double y, double z){
       this.panjang = p;
       this.lebar = l;
       this.luasTanah = x;
       this.isiPerBox = y;
       this.hargaPerBox = z;
    }
    
    /* membuat Methods*/
    /* menghitung Luas Keramik*/
    double luasKeramik(){
        double luas;
        luas = this.panjang * this.lebar;
        return luas;
    }
   
    double jumlahKeramik(){
        double jumlah;
        jumlah = this.luasTanah / this.luasKeramik();
        return Math.ceil(jumlah);
    }
    double hargaKeramik(){
        double harga;
        harga = Math.ceil(this.jumlahKeramik() / this.isiPerBox) * hargaPerBox;
        return harga;
 
    }  
}
