/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package METAMATIKA;

/**
 *
 * @author LENOVO
 */
public class MATEMATIKABeraksi {
    public static void main(String[] args) {
        // Create an object of MATEMATIKA class
        MATEMATIKA matematikaRizal = new MATEMATIKA(); 
        
        // Perform arithmetic operations and display results
        System.out.println("PERTAMBAHAN: 5 + 10 = " + matematikaRizal.PERTAMBAHAN(5, 10)); 
        System.out.println("PENGURANGAN: 30 - 30 = " + matematikaRizal.PENGURANGAN(30, 30)); 
        System.out.println("PERKALIAN: 4 * 8 = " + matematikaRizal.PERKALIAN(4, 8)); 
        System.out.println("PEMBAGIAN: 25 / 5 = " + matematikaRizal.PEMBAGIAN(25, 5)); 
    }
}
