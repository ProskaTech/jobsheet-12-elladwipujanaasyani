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
public class polymorphismStatic {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // memanggil metode perimeter dengan satu argumen
        System.out.println(
                "Sisi Persegi adalah : 4\nKeliling Persegi adalah : " + CompileTime.keliling(4) + "\n");
        // memanggil metode perimeter dengan dua argumen
        System.out.println(
                "Sisi Persegi Panjang adalah : 10,13 \nKeliling Persegi Panjang adalah : "
                        + CompileTime.keliling(10, 13));
    }
}
