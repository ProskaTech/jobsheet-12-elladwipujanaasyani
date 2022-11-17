// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package js12inheritance;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class JavaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        // membuat objek kendaraan roda empat 
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
