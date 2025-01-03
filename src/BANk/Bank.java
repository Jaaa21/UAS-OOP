/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BANk;

/**
 *
 * @author LENOVO
 */
public class Bank {
    private int saldo;

    // Konstruktor Bank
    public Bank(int saldo) {
        this.saldo = saldo;
    }

    // Metode untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo sekarang: Rp. " + saldo);
    }

    // Metode untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo sekarang: Rp. " + saldo);
        } else {
            System.out.println("Saldo tidak cukup.");
        }
    }

    // Metode untuk mendapatkan saldo
    public int getSaldo() {
        return saldo;
    }
}
