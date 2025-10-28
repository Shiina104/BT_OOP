/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soRand = (int)(Math.random() * 101);
        System.out.println("Da random so tu 1 den 100!");
        int soDoan;
        do {            
            System.out.print("Nhap so ban doan: ");
            soDoan = scanner.nextInt();
            if (soDoan == soRand) {
                System.out.println("Ban aa doan dung");
            } else if (soDoan > soRand) {
                System.out.println("So ban doan lon hon");
            } else {
                System.out.println("So ban doan nho hon");
            }
        } while (soDoan != soRand);
        return;
    }
}
