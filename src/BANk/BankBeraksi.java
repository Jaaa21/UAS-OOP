/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BANk;

/**
 *
 * @author LENOVO
 */
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal 200000
        Bank bank = new Bank(200000);
        System.out.println("Selamat Datang di Bank Ambon");
        System.out.println("Saldo sekarang: Rp. " + bank.getSaldo());

        // Menyimpan uang
        bank.simpanUang(10000);

        // Mengambil uang
        bank.ambilUang(50000);

        // Menampilkan saldo terakhir
        System.out.println("Saldo akhir: Rp. " + bank.getSaldo());
    }
}

