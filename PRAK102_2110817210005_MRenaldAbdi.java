/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak102.pkg2110817210005.m.renaldabdi;

// Mengimpor Class Scanner untuk dapat melakukan proses penginputan data
import java.util.Scanner;
/**
 *
 * @author Renald
 */
public class PRAK102_2110817210005_MRenaldAbdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        int DataInput, i = 1;
        
        // Membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Melakukan Data Inputan Dari User
        DataInput = keyboard.nextInt();
        int hasil = DataInput;
        
        // Proses Perulangan While
        while(i < 8){
            // Menampilkan Hasil Data
            if(DataInput % 2 == 0) {
                if(i == 1) {
                    hasil = ( DataInput / 2 ) - 1;
                    System.out.print(hasil);
                } else if(i % 2 == 1) {
                    hasil /= 2;
                    System.out.print(hasil);
                } else {
                    hasil = (hasil * 2) + 3;
                    System.out.print(hasil);
                }
            } else {
                if(i == 1) {
                    System.out.print(hasil);
                } else if(i % 2 == 1) {
                    hasil = (hasil * 2) + 3;
                    System.out.print(hasil);
                } else {                   
                    hasil /= 2;
                    System.out.print(hasil);
                }
            }
            // Memberikan tanda koma
            if(i < 7) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("");
    }
    
}
