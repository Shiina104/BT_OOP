/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt10 {
    public static void main(String[] args) throws FileNotFoundException {
        File number = new File("numbers.txt");
        Scanner sc = new Scanner(number);
        String line = sc.nextLine();
        String[] arr = line.trim().split(",");
        int tong = 0, max = Integer.MIN_VALUE;
        for (String n : arr) {
            int num = Integer.parseInt(n);
            tong += num;
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Trung binh: %.1f\nMax: %d\n", (tong * 1.0)/arr.length, max);
    }
}
