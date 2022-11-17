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
 class Bank {
        float sukuBunga(){
        return 0;
        }
 }
class BRI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
    return 5.5f;
    }
}
class BNI extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
    return 10.6f;
    }
}
class Mandiri extends Bank{
    //overriding sukuBunga method
    float sukuBunga(){
    return 9.4f;
    }
}
class polymorphismDynamic{
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // creating variable of bank class
        Bank B;
        B = new BRI();
        System.out.println("ingkat suku Bunga BRI adalah : "+B.sukuBunga());
        B = new BNI();
        System.out.println("ingkat suku Bunga BNI adalah : "+B.sukuBunga());
        B = new Mandiri();
        System.out.println("ingkat suku Bunga Mandiri adalah : "+B.sukuBunga());
        
    }
}
