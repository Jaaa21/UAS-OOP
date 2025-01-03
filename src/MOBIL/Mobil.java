/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOBIL;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    String merkMobil;
    int ccMesin;

    // Konstruktor dengan parameter
    public Mobil(String merkMobil, int ccMesin) {
        this.merkMobil = merkMobil;
        this.ccMesin = ccMesin;
    }

    // Konstruktor default (opsional, jika diperlukan)
    public Mobil() {
        // Konstruktor kosong, bisa diisi dengan nilai default jika diperlukan
    }
    
    public static void main(String[] args) {
        // Membuat objek mobilSaya dengan konstruktor default
        Mobil mobilSaya = new Mobil();
        
        // Menetapkan nilai ke variabel objek
        mobilSaya.merkMobil = "VENTURER";
        mobilSaya.ccMesin = 2500;
        
        // Menampilkan informasi mobil
        System.out.println("Merk Mobil: " + mobilSaya.merkMobil);
        System.out.println("CC Mesin: " + mobilSaya.ccMesin);
    }
}
