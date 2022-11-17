// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package js12inheritance;

/**
 *
 * @author Ella Dwipujana ASyani
 */
public class BuahUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // menggunakan constructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp.3000","Merah");
        //mengunakan getter ke nilai 
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga:"
                + Apel.getPrice()+"\nWarna:"+Apel.getColor());
        //update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di Update");
        //menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah : "+ Apel.getName()+"\nHarga:"
                            +Apel.getPrice()+"\nWarna: "+Apel.getColor());
    }
}
