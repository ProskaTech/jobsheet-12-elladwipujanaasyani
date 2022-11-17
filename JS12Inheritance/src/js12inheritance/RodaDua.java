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
public class RodaDua extends Kendaraan{
        double NaikHargaKe = 0.20; //0.2 kali
        void hargaAkhir()
        {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga sepeda menjadi Rp."
                + "hargaDasar");
        }
  
}
