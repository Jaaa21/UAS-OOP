/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ac;

/**
 *
 * @author LENOVO
 */
public class AC {
    // Status AC: MATI = 0, HIDUP = 1
    public static final int MATI = 0;
    public static final int HIDUP = 1;

    private int statusAC;

    // Konstruktor untuk inisialisasi status AC
    public AC() {
        this.statusAC = MATI; // Secara default, status AC adalah mati
    }

    // Mendapatkan status AC
    public int getStatusAC() {
        return statusAC;
    }

    // Mengubah status AC (hidup/mati)
    public void setStatusAC(int statusAC) {
        this.statusAC = statusAC;
    }

    // Metode untuk menghidupkan AC
    public void hidupkanAC() {
        if (statusAC == MATI) {
            statusAC = HIDUP;
            System.out.println("Hidupkan AC! --> AC hidup");
        } else {
            System.out.println("Hidupkan AC! --> AC sudah hidup");
        }
    }

    // Metode untuk mematikan AC
    public void matikanAC() {
        if (statusAC == HIDUP) {
            statusAC = MATI;
            System.out.println("Matikan AC! --> AC mati");
        } else {
            System.out.println("Matikan AC! --> AC sudah mati");
        }
    }
}

