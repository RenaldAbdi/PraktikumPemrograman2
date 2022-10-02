/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak101.pkg2110817210005.m.renaldabdi;

import java.util.Scanner;
/**
 *
 * @author Renald
 */
public class PRAK1012110817210005MRenaldAbdi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nama, TempatLahir;
        int TanggalLahir, BulanLahir, TahunLahir, TinggiBadan;
        float BeratBadan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap : ");
        Nama = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir : ");
        TempatLahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        TanggalLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        BulanLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir : ");
        TahunLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        TinggiBadan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        BeratBadan = keyboard.nextFloat();
        
        // Bulan
        String Bulan = "Bulan";
        switch (BulanLahir) {
            case 1 -> Bulan = "Januari";
            case 2 -> Bulan = "Februari";
            case 3 -> Bulan = "Maret";
            case 4 -> Bulan = "April";
            case 5 -> Bulan = "Mei";
            case 6 -> Bulan = "Juni";
            case 7 -> Bulan = "Juli";
            case 8 -> Bulan = "Agustus";
            case 9 -> Bulan = "September";
            case 10 -> Bulan = "Oktober";
            case 11 -> Bulan = "November";
            case 12 -> Bulan = "Desember";
            default -> {
            }
        }
        
        System.out.println("Data telah ditambahkan,");
        System.out.println("Nama Lengkap " + Nama + ", Lahir di " + TempatLahir + " pada Tanggal " + TanggalLahir + " " + Bulan + " " + TahunLahir);
        System.out.println("Tinggi Badan " + TinggiBadan + " cm dan Berat Badan " + BeratBadan + " kilogram");
    }
    
}
