/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak104.pkg2110817210005.m.renaldabdi;

// Mengimpor Class Scanner untuk dapat melakukan proses penginputan data
import java.util.Scanner;
/**
 *
 * @author Renald
 */
public class PRAK104_2110817210005_MRenaldAbdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int[] Andi = new int[3];
        int[] Budi = new int[3];
        int KartuAndi = 0, KartuBudi = 0;
        
        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Melakukan Data Inputan untuk Kartu Andi 
        System.out.print("Kartu Andi: ");
        for (int i = 0; i < 3; i++) {
            Andi[i] = keyboard.nextInt();
        }
        
        // Melakukan Data Inputan untuk Kartu Budi
        System.out.print("Kartu Budi: ");
        for (int i = 0; i < 3; i++) {
            Budi[i] = keyboard.nextInt();
        }
        
        // Menentukan Poin Pemain
        for(int i = 0; i < 3; i++) {
            if(Budi[i] < Andi[i]) {
                KartuAndi++;
            } else if(Budi[i] > Andi[i]) {
                KartuBudi++;
            } 
        }
        
        // Menampilkan Pemenang
        for(int i = 0; i < 3; i++) {
            if((Andi[i] < 2 || Andi[i] > 10) || (Budi[i] < 2 || Budi[i] > 10)) {
                System.out.println("Poin Kartu Hanya Bernilai 2 - 10");
                break;
            } else if(KartuBudi > KartuAndi) {
                System.out.println("Budi");
                break;
            } else if(KartuBudi < KartuAndi) {
                System.out.println("Andi");
                break;
            } else {
                System.out.println("Seri");
                break;
            } 
        }
    }
}
