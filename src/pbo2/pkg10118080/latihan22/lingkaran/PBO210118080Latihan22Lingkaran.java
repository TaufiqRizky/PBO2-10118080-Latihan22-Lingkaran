/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan22.lingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program Menghiting lingkaran
 */
public class PBO210118080Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========== Perhitungan Lingkaran ==========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        Scanner D = new Scanner(System.in);
        int Diameter;
        while (!D.hasNextInt()) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            System.out.print("Masukan Nilai Diameter Lingkaran : ");
            D.next(); // this is important!
        }
        Diameter = D.nextInt();
        int r = Diameter/2;
        double Luas =3.14*r*r;
        double Keliling = 2 *3.14*r;
        System.out.println("====== Hasil Perhitungan Lingkaran ======");
        System.out.println("Jari-jari Lingkaran \t ="+r+" cm");
        System.out.println("Luar Lingkaran \t\t ="+Luas+" cm");
        System.out.println("Keliling Lingkaran \t ="+Keliling+" cm");
        System.out.println("Developed By : Taufiq Rizky");
    }
    
}
