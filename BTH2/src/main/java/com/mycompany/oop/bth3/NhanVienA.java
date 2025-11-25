/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class NhanVienA extends NhanVien{

    public NhanVienA(String CMND, String hoTen, String queQuan, int gioiTinh, String sdt) {
        super(CMND, hoTen, queQuan, gioiTinh, sdt);
        this.maNV = "NVA" + String.format("%04d", ++so);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return 1.2 * NhanVien.LUONG * soNgayCong;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBo phan: A";
    }
    
    
}
