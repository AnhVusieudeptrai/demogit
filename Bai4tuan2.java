/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan2;

 
import java.util.Scanner;
public class bai4tuan2 {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao so tien gui (VND)");
            double tien = scanner.nextDouble();
            System.out.println("Lai suat hang nam (%)");
            double lai = scanner.nextDouble();
            System.out.println("Gui bao nhieu thang?");
            int sothang = scanner.nextInt();
            double lsht = lai / 12.0 / 100.0;
            double tienlai = tien*lsht * (double)sothang;
            double tiengoc = tienlai + tien;
            System.out.printf("So tien lai la:%.2f VND\n" , tienlai );
            System.out.printf("So tien goc cuoi ki la:%.2f VND" , tiengoc );
        }
}

    