/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEPEDA;

/**
 *
 * @author LENOVO
 */
public class SEPEDABeraksi {
    public static void main(String[] args) {
       SEPEDA sepedaRizal = new SEPEDA(0); // Berikan nilai awal gir = 0
        
       sepedaRizal.setGir(2);
       System.out.println("GIR SEPEDA SEKARANG: " + sepedaRizal.getGir());
        
       sepedaRizal.setGir(3);
       System.out.println("GIR SEPEDA SEKARANG: " + sepedaRizal.getGir());
    }
}