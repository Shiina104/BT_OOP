/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop.bth2;

import com.mycompany.oop.bth2.bth2package.Diem;
import com.mycompany.oop.bth2.bth2package.HinhChuNhat;
import com.mycompany.oop.bth2.bth2package.PhanSo;

/**
 *
 * @author admin
 */
public class BTH2 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        String[] arr = new String[]{"abc", "123"};
//        System.out.println(arr.length);
//        HinhChuNhat h = new HinhChuNhat(5, 2);
//        System.out.println(h.chuVi());
//        System.out.println(h.dienTich());
//        
//        Diem d1 = new Diem(3, 5);
//        Diem d2 = new Diem(5, 1);
//        d1.hienThi();
//        System.out.println(d1.khoangCach(d2));
        PhanSo p1 = new PhanSo(2, 5);
        PhanSo p2 = new PhanSo(3, 7);
        
        PhanSo p = p1.congPS(p2);
        p.hienThi();
        
        p = p1.truPS(p2);
        p.hienThi();
        
        p = p1.nhanPS(p2);
        p.hienThi();
        
        p = p1.chiaPS(p2);
        p.hienThi();

    }
}
