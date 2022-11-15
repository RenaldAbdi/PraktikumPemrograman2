package praktikum4.soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
    String judul = "", penulis = "";
    Integer tahun = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Judul: ");
    judul = input.nextLine();

    System.out.print("Penulis: ");
    penulis = input.nextLine();

    System.out.print("Tahun Terbit: ");
    tahun = input.nextInt();

    Buku buku = new Buku(judul, penulis, tahun);

    buku.display(); 
    }
}