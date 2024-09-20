/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3tuan2;
 import java.util.Scanner;
/**
 *
 * @author OS
 */
public class Bai3tuan2 {
       

    public static void main(String[] args) {
          int a=0;
          int b=0;
     Scanner scanner= new Scanner(System.in);
        System.out.print("nhap vao 2 so nguyen: ");
      a=scanner.nextInt();
      b=scanner.nextInt();
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        int thuong=0;
        int phdu=0;
        if (b != 0) {
            thuong = a / b;
            phdu = a % b;
        } else {
            System.out.println("khong thuc hien duoc.");
        }
      System.out.println("tong la: " +tong);
      System.out.println("hieu la: " +hieu);
      System.out.println("tich la: " +tich);
      if (b != 0) {
            System.out.println("thuong la: " +thuong);
            System.out.println("Phan du : " +phdu);
        }
    }
}
  
