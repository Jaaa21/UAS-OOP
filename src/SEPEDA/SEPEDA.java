/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEPEDA;

/**
 *
 * @author LENOVO
 */
// Class SEPEDA
public class SEPEDA {
    private int gir;

    // Konstruktor untuk menginisialisasi gir
    public SEPEDA(int girAwal) {
        this.gir = girAwal;
    }

    // Metode untuk menambah gir
    public void setGir(int pertambahanGir) {
        // Mengecek agar pertambahan gir tidak membuat nilai gir negatif
        if (gir + pertambahanGir >= 0) {
            gir = gir + pertambahanGir;
        } else {
            System.out.println("Gir tidak bisa menjadi negatif");
        }
    }

    // Metode untuk mendapatkan jumlah gir
    public int getGir() {
        return gir;
    }

    // Metode untuk mereset nilai gir ke 0
    public void resetGir() {
        gir = 0;
    }

    // Metode untuk mencetak status gir sepeda
    public void printStatus() {
        System.out.println("Jumlah gir sepeda saat ini: " + gir);
    }

    public static void main(String[] args) {
        SEPEDA sepeda1 = new SEPEDA(3); // Sepeda dengan gir awal 3
        sepeda1.printStatus();
        
        sepeda1.setGir(2); // Menambah 2 gir
        sepeda1.printStatus();

        sepeda1.setGir(-1); // Mengurangi 1 gir
        sepeda1.printStatus();

        sepeda1.resetGir(); // Mereset gir ke 0
        sepeda1.printStatus();
    }
}
