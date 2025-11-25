/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class bt03 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Niief", "uuiu ufdinui fe", "HDi43", 15000);
        SanPham sp2 = new Sach("Mgiuj", "iouhf iudshiuf oihfu", "DH23mni", 20000, 999);
        SanPham sp3 = new BangDia("Crhda", "iuh uishhiu foiush", "HDiji", 12000, 1500);
        
        
        DsSanPham danh = new DsSanPham();
        danh.themSP(sp1);
        danh.themSP(sp2);
        danh.themSP(sp3);
        
        danh.timKiemTheoGia(13000, 20000).forEach(d -> System.out.println(d));
    }
}
