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
public class PakBejoPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Keramik A*/
        
        MemilihKeramik A = new MemilihKeramik (30, 30, 1000000, 10, 54000);
        A.jenis = "A";
        System.out.println("keramik " + A.jenis);
        System.out.println("Harga Keramik Perbox Rp: " + A.hargaPerBox);
        System.out.println("Luas Keramik: " + A.luasKeramik() +  "cm2" );
        System.out.println("jumlah Keramik Yang Dibutuhkan: " + A.jumlahKeramik() );
        System.out.println("jumlah Total Harga Yang Harus Dibayar Rp: " + A.hargaKeramik());
        
        /* Keramik B */
        MemilihKeramik B = new MemilihKeramik (40, 40, 1000000, 5, 65000);
        B.jenis = "B";
        System.out.println("keramik " + B.jenis);
        System.out.println("Harga Keramik Perbox Rp: " + B.hargaPerBox);
        System.out.println("Luas Keramik: " + B.luasKeramik() +  "cm2" );
        System.out.println("jumlah Keramik Yang Dibutuhkan: " + B.jumlahKeramik() );
        System.out.println("jumlah Total Harga Yang Harus Dibayar Rp: " + B.hargaKeramik());
        
        /* keramik C */
        MemilihKeramik C = new MemilihKeramik (30, 40, 1000000, 8, 60000);
        C.jenis = "C";
        System.out.println("keramik " + C.jenis);
        System.out.println("Harga Keramik Perbox Rp: " + C.hargaPerBox);
        System.out.println("Luas Keramik: " + A.luasKeramik() +  "cm2" );
        System.out.println("jumlah Keramik Yang Dibutuhkan: " + C.jumlahKeramik() );
        System.out.println("jumlah Total Harga Yang Harus Dibayar Rp: " + C.hargaKeramik());
    }
    
}
