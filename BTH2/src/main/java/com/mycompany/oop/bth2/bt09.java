/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> SinhVien = new ArrayList<String>();
        SinhVien.add("Huy Nova");
        SinhVien.add("Em Da Den");
        SinhVien.add("Lieu Nhu Yen");
        
        int luaChon = 1;
        do {            
            System.out.print("Cac chuc nang:\n"
                    + "1. Them ten sinh vien\n"
                    + "2. Xuat danh sach sinh vien\n"
                    + "3. Xoa sinh vien theo ho/ten\n"
                    + "4. Tim kiem sinh vien\n"
                    + "0. Thoat\n"
                    + "Nhap lua chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap ho ten sinh vien:");
                    String sv = scanner.nextLine();
                    SinhVien.add(sv);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien:");
                    SinhVien.forEach(s -> System.out.print(s + "/"));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Nhap ho/ten:");
                    String ht = scanner.nextLine();
                    SinhVien.removeIf(s -> s.toLowerCase().contains(ht.toLowerCase()));
                    break;
                case 4:
                    System.out.println("Nhap ten:");
                    String t = scanner.nextLine();
                    SinhVien.forEach(s -> {
                        String[] name = s.split(" ");
                        if ((name[name.length - 1].toLowerCase()).equals(t.toLowerCase())) {
                            System.out.println(s);
                        }
                    });
                    break;
                default:
                    break;
            }
        } while (luaChon != 0);
    }
}
