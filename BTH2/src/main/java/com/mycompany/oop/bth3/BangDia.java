/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.bth3;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham{
    private double thoiLuong;

    public BangDia(String tenSP, String moTa, String NSX, double giaBan, double thoiLuong) {
        super(tenSP, moTa, NSX, giaBan);
        this.thoiLuong = thoiLuong;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThoi luong: " + this.thoiLuong;
    }

    
    
    /**
     * @return the thoiLuong
     */
    public double getThoiLuong() {
        return thoiLuong;
    }

    /**
     * @param thoiLuong the thoiLuong to set
     */
    public void setThoiLuong(double thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    
    
}
