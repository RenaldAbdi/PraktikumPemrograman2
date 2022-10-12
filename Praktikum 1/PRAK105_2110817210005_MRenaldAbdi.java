/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak105.pkg2110817210005.m.renaldabdi;

// Mengimpor Class Scanner untuk dapat melakukan proses penginputan data
import java.util.Scanner;
// Mengimfor Class Decimal Format untuk membatasi angka dibelakang koma
import java.text.DecimalFormat;
/**
 *
 * @author Renald
 */
public class PRAK105_2110817210005_MRenaldAbdi {
    
    // Membuat Konstanta untuk phi
    public static final double PHI = 3.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        double JariJari, TinggiTabung, hasil;
        
        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Melakukan Data Inputan untuk jari jari
        System.out.print("Masukkan jari-jari: ");
        JariJari= keyboard.nextDouble();
        
        // Melakukan Data Inputan untuk Tinggi Tabung
        System.out.print("Masukkan tinggi: ");
        TinggiTabung = keyboard.nextDouble();
        
        // Rumus Volume Tabung
        hasil = PHI * ( JariJari * JariJari ) * TinggiTabung;
        DecimalFormat df = new DecimalFormat("#.###");
        DecimalFormat dfP = new DecimalFormat("#.#");
        
        // Menampilkan Hasil Perhitungan
        System.out.println("Volume tabung dengan jari-jari " + JariJari + " cm dan");
        System.out.println("tinggi " + TinggiTabung + " cm adalah " + df.format(hasil) + " m3" );
    }
    
}