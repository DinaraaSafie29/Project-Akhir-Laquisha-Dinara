package com.mycompany.latianprojectakhir;
import java.util.Scanner;
public class Latianprojectakhir {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner masuk = new Scanner(System.in);
    String barang[] = new String[3];
    int  harga[] = new int[3];
    
    System.out.println("==================================================");
    System.out.println("                         KASIR                    ");
    System.out.println("                 MINIMARKET TREASURE              ");
    System.out.println("==================================================");
    
    System.out.print("Barang pertama yang dibeli : ");
    barang[0] = input.nextLine();
    System.out.print("Harga barang pertama yang dibeli : ");
    harga[0] =  masuk.nextInt();
    
    System.out.print("Barang kedua yang dibeli : ");
    barang[1] = input.nextLine();
    System.out.print("Harga barang kedua yang dibeli : ");
    harga[1] = masuk.nextInt();
    
    System.out.print("Barang ketiga yang dibeli : ");
    barang[2] = input.nextLine();
    System.out.print("Harga barang ketiga yang dibeli : ");
    harga[2] = masuk.nextInt();
    
    int total;
    total = harga[0] + harga[1] + harga [2];
    System.out.println("        List Barang          Harga");
    System.out.println("        "+barang[0]+"       " +harga[0]);
    System.out.println("        "+barang[1]+"       " +harga[1]);
    System.out.println("        "+barang[2]+"       " +harga[2]);
    System.out.println("          total"                +total);
    
    }
}
