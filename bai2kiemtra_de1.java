/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai2kiemtra_de1 {
     public static void main(String[] args) {
        System.out.println("Chuong trinh tinh hinh chu nhat");
        Scanner sc = new Scanner(System.in);
        double canha, canhb, canhc, nuacv, chuvi, dientich;
        System.out.print("Nhap canha:");
        canha = sc.nextInt();
        System.out.print("Nhap canhb:");
        canhb = sc.nextInt();
        System.out.print("Nhap canhc:");
        canhc = sc.nextInt();
        
        nuacv = (canha+canhb+canhc)/2;
       
        chuvi = (canha+canhb+canhc);
        
        dientich = Math.sqrt(nuacv*(nuacv - canha) * (nuacv - canhb) * (nuacv - canhc));
        System.out.println("chu vi la: " + chuvi);
        System.out.println("dientich  " + dientich);
        
    }
}

