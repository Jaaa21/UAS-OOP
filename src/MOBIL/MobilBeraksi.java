/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOBIL;

/**
 *
 * @author LENOVO
 */
class MobilBeraksi {
    public static void main(String[] args) {
        // Membuat objek mobilSaya menggunakan konstruktor default
        Mobil mobilSaya = new Mobil();
        
        // Mengisi nilai untuk objek mobilSaya
        mobilSaya.merkMobil = "VENTURER";
        mobilSaya.ccMesin = 2500;
        
        // Menampilkan informasi mobil
        System.out.println("Merk Mobil: " + mobilSaya.merkMobil);
        System.out.println("CC Mesin: " + mobilSaya.ccMesin);
    }
}
