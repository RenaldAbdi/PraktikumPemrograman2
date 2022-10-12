/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak103.pkg2110817210005.m.renaldabdi;

// Mengimpor Class Scanner untuk dapat melakukan proses penginputan data
import java.util.Scanner;
/**
 *
 * @author Renald
 */
public class PRAK103_2110817210005_MRenaldAbdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int DataInput, hasil, i = 1;
        
        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Melakukan inputan data dari user
        DataInput = keyboard.nextInt();
        hasil = DataInput;
        
        // Proses Perulangan Do While
        do {
            // Menampilkan Hasil Data
            if(hasil % 7 == 0) {
                System.out.print(" ");
                hasil -= 1;
            } else {
                System.out.print(hasil);
                hasil -= 1;        
            }
            // Menampilkan tanda koma
            if(i < 5) {
                System.out.print(", ");                
            }
            i++;  
        } while (i < 6);
        System.out.println("");
    }
    
}